/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Services;

/**
 *
 * @author Admin
 */


import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import java.security.spec.KeySpec;
import javax.crypto.spec.DESedeKeySpec;

import org.apache.commons.codec.binary.Base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
public class Encrypt {
    private KeySpec ks;
    private SecretKeyFactory skf;
      private static final String UNICODE_FORMAT = "UTF8";
    public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
    
    private static Cipher cipher;
    byte[] arrayBytes;
    private String myEncryptionKey;
    private String myEncryptionScheme;
    static SecretKey key;
  
    private static Random random = new Random((new Date()).getTime());
  
     public Encrypt() throws Exception {
        myEncryptionKey = "ThisIsSpartaThisIsSparta";
        myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
        arrayBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
        ks = new DESedeKeySpec(arrayBytes);
        skf = SecretKeyFactory.getInstance(myEncryptionScheme);
       Cipher cipher = Cipher.getInstance(myEncryptionScheme);
        key = skf.generateSecret(ks);
    }

  /**
   * Encrypt password by using SHA-256 algorithm, encryptedPassword length is 32 bits
   * @param clearTextPassword
   * @return
   * @throws NoSuchAlgorithmException
   * reference http://java.sun.com/j2se/1.4.2/docs/api/java/security/MessageDigest.html
   */
  public static String getEncryptedPassword(String clearTextPassword)   {  
  
    
    try {
      MessageDigest md = MessageDigest.getInstance("SHA-256");
      md.update(clearTextPassword.getBytes());
      return new sun.misc.BASE64Encoder().encode(md.digest());
    } catch (NoSuchAlgorithmException e) {
      //_log.error("Failed to encrypt password.", e);
    }
    return "";
  }
     public static String decrypt(String encryptedString) {
        String decryptedText=null;
        try {
//            Cipher c = cipher.init(Cipher.DECRYPT_MODE, key);
//            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] encryptedText = Base64.decodeBase64(encryptedString.getBytes());
            byte[] plainText = cipher.doFinal(encryptedText);
            decryptedText= new String(plainText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return decryptedText;
    }
    
}
