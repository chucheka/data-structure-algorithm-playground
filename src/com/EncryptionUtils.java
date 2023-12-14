package com;

import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;
public class EncryptionUtils {

    private static final String AES_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final byte[] AES_KEY = "0123456789abcdef".getBytes(); // 16-byte key
    private static final byte[] AES_IV = "abcdef0123456789".getBytes(); // 16-byte IV

    public static void main(String[] args) throws Exception {
        System.out.println(encrypt("chike").toString());
        System.out.println(encrypt("chike").toString());
    }
    public static byte[] encrypt(String plaintext) throws Exception {
        SecretKeySpec key = new SecretKeySpec(AES_KEY, "AES");
        IvParameterSpec iv = new IvParameterSpec(AES_IV);
        Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key, iv);
        return cipher.doFinal(plaintext.getBytes());
    }

    public static String decrypt(byte[] ciphertext) throws Exception {
        SecretKeySpec key = new SecretKeySpec(AES_KEY, "AES");
        IvParameterSpec iv = new IvParameterSpec(AES_IV);
        Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key, iv);
        return new String(cipher.doFinal(ciphertext));
    }
}