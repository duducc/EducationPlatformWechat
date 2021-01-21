package com.saint.wechat.utils;

import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

import org.apache.commons.lang.StringUtils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Encryptutil {
	private final byte[] DESIV = new byte[] { 0x12, 0x34, 0x56, 120, (byte) 0x90, (byte) 0xab, (byte) 0xcd, (byte) 0xef };// ����  
	  
    private AlgorithmParameterSpec iv = null;// �����㷨�Ĳ����ӿ�  
    private Key key = null;  
      
    private String charset = "utf-8";  
      
    /** 
     * ��ʼ�� 
     * @param deSkey    ��Կ 
     * @throws Exception 
     */  
    public  Encryptutil(String deSkey, String charset) throws Exception {  
        if (StringUtils.isNotBlank(charset)) {  
            this.charset = charset;  
        }  
        DESKeySpec keySpec = new DESKeySpec(deSkey.getBytes(this.charset));// ������Կ����  
        iv = new IvParameterSpec(DESIV);// ��������  
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");// �����Կ����  
        key = keyFactory.generateSecret(keySpec);// �õ���Կ����  
    }  
      
    /** 
     * ���� 
     * @author ershuai 
     * @date 2017��4��19�� ����9:40:53 
     * @param data 
     * @return 
     * @throws Exception 
     */  
    public String encode(String data) throws Exception {  
        Cipher enCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");// �õ����ܶ���Cipher  
        enCipher.init(Cipher.ENCRYPT_MODE, key, iv);// ���ù���ģʽΪ����ģʽ��������Կ������  
        byte[] pasByte = enCipher.doFinal(data.getBytes("utf-8"));  
        BASE64Encoder base64Encoder = new BASE64Encoder();  
        return base64Encoder.encode(pasByte);  
    }  
      
    /** 
     * ���� 
     * @author ershuai 
     * @date 2017��4��19�� ����9:41:01 
     * @param data 
     * @return 
     * @throws Exception 
     */  
    public String decode(String data) throws Exception {  
        Cipher deCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");  
        deCipher.init(Cipher.DECRYPT_MODE, key, iv);  
        BASE64Decoder base64Decoder = new BASE64Decoder();  
        byte[] pasByte = deCipher.doFinal(base64Decoder.decodeBuffer(data));  
        return new String(pasByte, "UTF-8");  
    }  
      
    public static void main(String[] args) {  
        try {  
            String test = "ershuai";  
            String key = "9ba45bfd500642328ec03ad8ef1b6e75";// �Զ�����Կ  
            Encryptutil des = new Encryptutil(key, "utf-8");  
            System.out.println("����ǰ���ַ���" + test);  
            System.out.println("���ܺ���ַ���" + des.encode(test));  
            System.out.println("���ܺ���ַ���" + des.decode(des.encode(test)));  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}
