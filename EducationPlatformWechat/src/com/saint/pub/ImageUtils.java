package com.saint.pub;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImageUtils {
	public static BufferedImage compressPhoto(String zpzl, InputStream in,int newWidth, int newHeight) {
		BufferedImage imgsrc = null;
		try {
			imgsrc = ImageIO.read(in);
			int width = imgsrc.getWidth(null);
			int height = imgsrc.getHeight(null);
			if (newWidth != 0) {
				if (newWidth >= width) {
					if (newHeight < height) {
						width = width * newHeight / height;
						height = newHeight;
					}
				} else if (newHeight >= height) {
					height = height * newWidth / width;
					width = newWidth;
				} else if (height > width) {
					width = width * newHeight / height;
					height = newHeight;
				} else {
					height = height * newWidth / width;
					width = newWidth;
				}
			}
			BufferedImage newimg = new BufferedImage(width, height, 1);
			newimg.getGraphics().drawImage(imgsrc, 0, 0, width, height, null);
			BufferedImage localBufferedImage1 = newimg;
			return localBufferedImage1;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
			try {
				in.close();
			} catch (IOException localIOException2) {
				localIOException2.printStackTrace();
			}
		}
	}
	public static BufferedImage compressPhotoToText(InputStream in,int newWidth, int newHeight,String pressText,String fontName,
            int fontStyle, Color color, int fontSize,int x,
            int y, float alpha) {
		BufferedImage imgsrc = null;
		try {
			imgsrc = ImageIO.read(in);
			int width = imgsrc.getWidth(null);
			int height = imgsrc.getHeight(null);
			if (newWidth != 0) {
				if (newWidth >= width) {
					if (newHeight < height) {
						width = width * newHeight / height;
						height = newHeight;
					}
				} else if (newHeight >= height) {
					height = height * newWidth / width;
					width = newWidth;
				} else if (height > width) {
					width = width * newHeight / height;
					height = newHeight;
				} else {
					height = height * newWidth / width;
					width = newWidth;
				}
			}
			BufferedImage newimg = new BufferedImage(width, height, 1);
			Graphics2D g = newimg.createGraphics();
			g.drawImage(imgsrc, 0, 0, width, height, null);
			g.setColor(color);
            g.setFont(new Font(fontName, fontStyle, fontSize));
            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP,alpha));
            // 在指定坐标绘制水印文字
            for(int i=0;i<5;i++){
            	g.drawString(pressText, (width - (getLength(pressText) * fontSize))/ 5*i + x, (height - fontSize) / 5*i + y);
            }
            g.dispose();
			BufferedImage localBufferedImage1 = newimg;
			return localBufferedImage1;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
			try {
				in.close();
			} catch (IOException localIOException2) {
				localIOException2.printStackTrace();
			}
		}
	}
	
	public static BufferedImage rotateImage(BufferedImage bufferedimage,
			int degree) {
		//System.out.println("==="+degree);
		int w = bufferedimage.getWidth();
		int h = bufferedimage.getHeight();
		int new_w = 0;
		int new_h = 0;
		int a_w = 0;
		int a_h = 0;
		int x = 0;
		int y = 0;
		int type = bufferedimage.getColorModel().getTransparency();
		if (degree % 180 == 0) {
			new_w = w;
			new_h = h;
			a_w = w / 2;
			a_h = h / 2;
		} else if (degree % 90 == 0) {
			new_w = h;
			new_h = w;
			a_w = h / 2;
			a_h = w / 2;
		} else {
			new_w = w;
			new_h = h;
			a_w = w / 2;
			a_h = h / 2;
		}
		x = new_w / 2 - w / 2;
		y = new_h / 2 - h / 2;
		BufferedImage img;
		Graphics2D graphics2d;
		(graphics2d = (img = new BufferedImage(new_w, new_h, type))
				.createGraphics()).setRenderingHint(
				RenderingHints.KEY_INTERPOLATION,
				RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		graphics2d.rotate(Math.toRadians(degree), a_w, a_h);
		graphics2d.translate(x, y);
		graphics2d.drawImage(bufferedimage, 0, 0, null);
		graphics2d.dispose();
		return img;
	}
	
	 /**
     * 计算text的长度（一个中文算两个字符）
     * @param text
     * @return
     */
    public final static int getLength(String text) {
        int length = 0;
        for (int i = 0; i < text.length(); i++) {
            if (new String(text.charAt(i) + "").getBytes().length > 1) {
                length += 2;
            } else {
                length += 1;
            }
        }
        return length / 2;
    }
    
    public static void printRandImg(HttpServletRequest request,HttpServletResponse response){
		int width = 65, height = 20;
		try {
			BufferedImage image = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);
			Graphics g = image.getGraphics();
			Random random = new Random();
			g.setColor(getRandColor(200, 250));
			g.fillRect(0, 0, width, height);
			g.setFont(new Font("Times   New   Roman", Font.PLAIN, 18));
			g.setColor(getRandColor(160, 200));
			for (int i = 0; i < 155; i++) {
				int x = random.nextInt(width);
				int y = random.nextInt(height);
				int xl = random.nextInt(10);
				int yl = random.nextInt(10);
				g.drawLine(x, y, x + xl, y + yl);
			}
			char c[] = new char[62];
			for (int i = 97, j = 0; i < 123; i++, j++) {
				c[j] = (char) i;
			}
			for (int o = 65, p = 26; o < 91; o++, p++) {
				c[p] = (char) o;
			}
			for (int m = 48, n = 52; m < 58; m++, n++) {
				c[n] = (char) m;
			}
			String sRand = "";
			for (int i = 0; i < 4; i++) {
				int x = random.nextInt(62);
				String rand = String.valueOf(c[x]);
				sRand += rand;
				g.setColor(new Color(20 + random.nextInt(110), 20 + random
						.nextInt(110), 20 + random.nextInt(110)));
				g.drawString(rand, 13 * i + 6, 16);
			}
			// 将认证码存入SESSION
			request.getSession().setAttribute("rand", sRand.toUpperCase());
			g.dispose();
			ImageIO.setUseCache(true);
			ServletOutputStream stream = response.getOutputStream();
			ImageIO.write(image, "JPEG", stream);
			stream.flush();
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Color getRandColor(int fc, int bc) {
		Random random = new Random();
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}
}
