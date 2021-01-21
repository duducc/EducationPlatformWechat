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
	 * ���û���ֵ
	 */
	static final int BUFFER = 8192;

	private static final String ALGORITHM = "PBEWithMD5AndDES";

	public static void zip(String zipFileName, String inputFile, String pwd)
			throws Exception {
		zip(zipFileName, new File(inputFile), pwd);
	}

	/**
	 * ����������ѹ��ָ��·���µ������ļ�
	 * 
	 * @param zipFileName
	 *            ѹ���ļ���(����·��)
	 * @param inputFile
	 *            ָ��ѹ���ļ���
	 * @return
	 * @throws Exception
	 */
	public static void zip(String zipFileName, String inputFile)
			throws Exception {
		zip(zipFileName, new File(inputFile), null);
	}

	/**
	 * ����������ѹ���ļ�����
	 * 
	 * @param zipFileName
	 *            ѹ���ļ���(����·��)
	 * @param inputFile
	 *            �ļ�����
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
	 *            ѹ�����������
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
			// ��ͨѹ���ļ�
			if (pwd == null || pwd.trim().equals("")) {
				int b;
				while ((b = inputStream.read()) != -1) {
					outputStream.write(b);
				}
				inputStream.close();
			}
			// ��ѹ���ļ�����
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
	 * ������������ѹ���ļ���ѹ��ָ�����ļ�Ŀ¼��
	 * 
	 * @param zipFileName
	 *            ѹ���ļ�����(��·��)
	 * @param outputDirectory
	 *            ָ����ѹĿ¼
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
					// ��ͨ��ѹ���ļ�
					if (pwd == null || pwd.trim().equals("")) {
						int b;
						while ((b = inputStream.read()) != -1) {
							outputStream.write(b);
						}
						outputStream.close();
					}
					// ��ѹ�������ļ�
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
			throw new Exception("��ѹ��ȡ�ļ�ʧ��");
		} catch (Exception ex) {
			throw new Exception("��ѹ�ļ����벻��ȷ");
		} finally {
			inputStream.close();
			outputStream.flush();
			outputStream.close();
		}
	}
	
	
	/** 
     *  
     * �Լ�����ѹ����������ͼƬѹ����byte[] 
     *  
     * @param image 
     *            ѹ��ԴͼƬ 
     * @param quality 
     *            ѹ����������0-1֮�䣬 
     * @return ���ص��ֽ����� 
     */  
    public byte[] bufferedImageTobytes(BufferedImage image, float quality) {  
        // ���ͼƬ�գ����ؿ�  
        if (image == null) {  
            return null;  
        }     
        // �õ�ָ��FormatͼƬ��writer  
        Iterator<ImageWriter> iter = ImageIO  
                .getImageWritersByFormatName("jpeg");// �õ�������  
        ImageWriter writer = (ImageWriter) iter.next(); // �õ�writer  
  
        // �õ�ָ��writer�������������(ImageWriteParam )  
        ImageWriteParam iwp = writer.getDefaultWriteParam();  
        iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT); // ���ÿɷ�ѹ��  
        iwp.setCompressionQuality(quality); // ����ѹ����������  
  
        iwp.setProgressiveMode(ImageWriteParam.MODE_DISABLED);  
  
        ColorModel colorModel = ColorModel.getRGBdefault();  
        // ָ��ѹ��ʱʹ�õ�ɫ��ģʽ  
        iwp.setDestinationType(new javax.imageio.ImageTypeSpecifier(colorModel,  
                colorModel.createCompatibleSampleModel(16, 16)));  
  
        // ��ʼ���ͼƬ��д��byte[]  
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); // ȡ���ڴ������  
        IIOImage iIamge = new IIOImage(image, null, null);  
        try {  
            // �˴���ΪImageWriter����������write��Ϣ��outputҪ�������ImageOutput  
            // ͨ��ImageIo�еľ�̬�������õ�byteArrayOutputStream��ImageOutput  
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
