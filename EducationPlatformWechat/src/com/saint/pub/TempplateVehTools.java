package com.saint.pub;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.xerces.impl.dv.util.Base64;


public class TempplateVehTools {
	private static byte[] iv = {1,2,3,4,5,6,7,8};  
	
	public static String encryptDES(String encryptString, String encryptKey) throws Exception {  
        IvParameterSpec zeroIv = new IvParameterSpec(iv);  
        SecretKeySpec key = new SecretKeySpec(encryptKey.getBytes(), "DES");  
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");  
        cipher.init(Cipher.ENCRYPT_MODE, key, zeroIv);  
        byte[] encryptedData = cipher.doFinal(encryptString.getBytes());  
        return Base64.encode(encryptedData);  
    }  
    public static String decryptDES(String decryptString, String decryptKey) throws Exception {  
        @SuppressWarnings("static-access")
		byte[] byteMi = new Base64().decode(decryptString);  
        IvParameterSpec zeroIv = new IvParameterSpec(iv);  
        SecretKeySpec key = new SecretKeySpec(decryptKey.getBytes(), "DES");  
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");  
        cipher.init(Cipher.DECRYPT_MODE, key, zeroIv);  
        byte decryptedData[] = cipher.doFinal(byteMi);  
       
        return new String(decryptedData);  
    }  

}