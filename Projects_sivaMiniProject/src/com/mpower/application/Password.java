package com.mpower.application;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Password {
	
	public static String getPassword()
	{
		return "";
	}
	
	public static String encryptPassword(String text)
	{
		
		try 
        {
            String key = "Bar12345Bar12345"; // 128 bit key
            // Create key and cipher
            Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            // encrypt the text
            cipher.init(Cipher.ENCRYPT_MODE, aesKey);
            byte[] encrypted = cipher.doFinal(text.getBytes());
            return new String(encrypted);
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
		
		return "sorry not encryptrd";
	}
	
	public static String decryptPassword(String text)
	{
		
		try 
        {
            String key = "Bar12345Bar12345"; // 128 bit key
            // Create key and cipher
            Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            // decrypt the text
           cipher.init(Cipher.DECRYPT_MODE, aesKey);
            String decrypted = new String(cipher.doFinal(text.getBytes()));
            return decrypted;
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
		
		return "sorry not decrypted";
	}

}
