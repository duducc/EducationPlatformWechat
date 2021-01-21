package com.saint.pub;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;

public class ZipTool {
	/**
	 * 设置缓冲值
	 */
	static final int BUFFER = 8192;

	private static final String ALGORITHM = "PBEWithMD5AndDES";

	public static void zip(String zipFileName, String inputFile, String pwd)
			throws Exception {
		zip(zipFileName, new File(inputFile), pwd);
	}

	/**
	 * 功能描述：压缩指定路径下的所有文件
	 * 
	 * @param zipFileName
	 *            压缩文件名(带有路径)
	 * @param inputFile
	 *            指定压缩文件夹
	 * @return
	 * @throws Exception
	 */
	public static void zip(String zipFileName, String inputFile)
			throws Exception {
		zip(zipFileName, new File(inputFile), null);
	}

	/**
	 * 功能描述：压缩文件对象
	 * 
	 * @param zipFileName
	 *            压缩文件名(带有路径)
	 * @param inputFile
	 *            文件对象
	 * @return
	 * @throws Exception
	 */
	public static void zip(String zipFileName, File inputFile, String pwd)
			throws Exception {
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(
				zipFileName));
		zip(out, inputFile, "", pwd);
		out.close();
	}

	/**
	 * 
	 * @param out
	 *            压缩输出流对象
	 * @param file
	 * @param base
	 * @throws Exception
	 */
	public static void zip(ZipOutputStream outputStream, File file,
			String base, String pwd) throws Exception {
		if (file.isDirectory()) {
			File[] fl = file.listFiles();
			outputStream.putNextEntry(new ZipEntry(base + "/"));
			base = base.length() == 0 ? "" : base + "/";
			for (int i = 0; i < fl.length; i++) {
				zip(outputStream, fl[i], base + fl[i].getName(), pwd);
			}
		} else {
			outputStream.putNextEntry(new ZipEntry(base));
			FileInputStream inputStream = new FileInputStream(file);
			// 普通压缩文件
			if (pwd == null || pwd.trim().equals("")) {
				int b;
				while ((b = inputStream.read()) != -1) {
					outputStream.write(b);
				}
				inputStream.close();
			}
			// 给压缩文件加密
			else {
				PBEKeySpec keySpec = new PBEKeySpec(pwd.toCharArray());
				SecretKeyFactory keyFactory = SecretKeyFactory
						.getInstance(ALGORITHM);
				SecretKey passwordKey = keyFactory.generateSecret(keySpec);
				byte[] salt = new byte[8];
				Random rnd = new Random();
				rnd.nextBytes(salt);
				int iterations = 100;
				PBEParameterSpec parameterSpec = new PBEParameterSpec(salt,
						iterations);
				Cipher cipher = Cipher.getInstance(ALGORITHM);
				cipher.init(Cipher.ENCRYPT_MODE, passwordKey, parameterSpec);
				outputStream.write(salt);
				byte[] input = new byte[64];
				int bytesRead;
				while ((bytesRead = inputStream.read(input)) != -1) {
					byte[] output = cipher.update(input, 0, bytesRead);
					if (output != null) {
						outputStream.write(output);
					}
				}
				byte[] output = cipher.doFinal();
				if (output != null) {
					outputStream.write(output);
				}
				inputStream.close();
				outputStream.flush();
				outputStream.close();
			}
		}
		file.delete();
	}

	public static void unzip(String zipFileName, String outputDirectory)
			throws Exception {
		ZipInputStream inputStream = new ZipInputStream(new FileInputStream(
				zipFileName));
		unzip(inputStream, outputDirectory, null);
	}

	/**
	 * 功能描述：将压缩文件解压到指定的文件目录下
	 * 
	 * @param zipFileName
	 *            压缩文件名称(带路径)
	 * @param outputDirectory
	 *            指定解压目录
	 * @return
	 * @throws Exception
	 */
	public static void unzip(String zipFileName, String outputDirectory,
			String pwd) throws Exception {
		ZipInputStream inputStream = new ZipInputStream(new FileInputStream(
				zipFileName));
		unzip(inputStream, outputDirectory, pwd);
	}

	public static void unzip(File zipFile, String outputDirectory, String pwd)
			throws Exception {
		ZipInputStream inputStream = new ZipInputStream(new FileInputStream(
				zipFile));
		unzip(inputStream, outputDirectory, pwd);
	}

	public static void unzip(ZipInputStream inputStream,
			String outputDirectory, String pwd) throws Exception {
		ZipEntry zipEntry = null;
		FileOutputStream outputStream = null;
		try {
			while ((zipEntry = inputStream.getNextEntry()) != null) {
				if (zipEntry.isDirectory()) {
					String name = zipEntry.getName();
					name = name.substring(0, name.length() - 1);
					File file = new File(outputDirectory + File.separator
							+ name);
					file.mkdir();
				} else {
					File file = new File(outputDirectory + File.separator
							+ zipEntry.getName());
					file.createNewFile();
					outputStream = new FileOutputStream(file);
					// 普通解压缩文件
					if (pwd == null || pwd.trim().equals("")) {
						int b;
						while ((b = inputStream.read()) != -1) {
							outputStream.write(b);
						}
						outputStream.close();
					}
					// 解压缩加密文件
					else {
						PBEKeySpec keySpec = new PBEKeySpec(pwd.toCharArray());
						SecretKeyFactory keyFactory = SecretKeyFactory
								.getInstance(ALGORITHM);
						SecretKey passwordKey = keyFactory
								.generateSecret(keySpec);
						byte[] salt = new byte[8];
						inputStream.read(salt);
						int iterations = 100;
						PBEParameterSpec parameterSpec = new PBEParameterSpec(
								salt, iterations);
						Cipher cipher = Cipher.getInstance(ALGORITHM);
						cipher.init(Cipher.DECRYPT_MODE, passwordKey,
								parameterSpec);
						byte[] input = new byte[64];
						int bytesRead;
						while ((bytesRead = inputStream.read(input)) != -1) {
							byte[] output = cipher.update(input, 0, bytesRead);
							if (output != null) {
								outputStream.write(output);
							}
						}
						byte[] output = cipher.doFinal();
						if (output != null) {
							outputStream.write(output);
						}
						outputStream.flush();
						outputStream.close();
					}
				}
			}
			inputStream.close();
		} catch (IOException ex) {
			throw new Exception("解压读取文件失败");
		} catch (Exception ex) {
			throw new Exception("解压文件密码不正确");
		} finally {
			inputStream.close();
			outputStream.flush();
			outputStream.close();
		}
	}
	
	
	/** 
     *  
     * 自己设置压缩质量来把图片压缩成byte[] 
     *  
     * @param image 
     *            压缩源图片 
     * @param quality 
     *            压缩质量，在0-1之间， 
     * @return 返回的字节数组 
     */  
    public byte[] bufferedImageTobytes(BufferedImage image, float quality) {  
        // 如果图片空，返回空  
        if (image == null) {  
            return null;  
        }     
        // 得到指定Format图片的writer  
        Iterator<ImageWriter> iter = ImageIO  
                .getImageWritersByFormatName("jpeg");// 得到迭代器  
        ImageWriter writer = (ImageWriter) iter.next(); // 得到writer  
  
        // 得到指定writer的输出参数设置(ImageWriteParam )  
        ImageWriteParam iwp = writer.getDefaultWriteParam();  
        iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT); // 设置可否压缩  
        iwp.setCompressionQuality(quality); // 设置压缩质量参数  
  
        iwp.setProgressiveMode(ImageWriteParam.MODE_DISABLED);  
  
        ColorModel colorModel = ColorModel.getRGBdefault();  
        // 指定压缩时使用的色彩模式  
        iwp.setDestinationType(new javax.imageio.ImageTypeSpecifier(colorModel,  
                colorModel.createCompatibleSampleModel(16, 16)));  
  
        // 开始打包图片，写入byte[]  
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); // 取得内存输出流  
        IIOImage iIamge = new IIOImage(image, null, null);  
        try {  
            // 此处因为ImageWriter中用来接收write信息的output要求必须是ImageOutput  
            // 通过ImageIo中的静态方法，得到byteArrayOutputStream的ImageOutput  
            writer.setOutput(ImageIO  
                    .createImageOutputStream(byteArrayOutputStream));  
            writer.write(null, iIamge, iwp);  
        } catch (IOException e) {  
            System.out.println("write errro");  
            e.printStackTrace();  
        }  
      
        return byteArrayOutputStream.toByteArray();  
    }  
}
