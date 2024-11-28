package com.example.SistemaMonitoreo.util;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AES {

    private static final String ALGORITHM = "AES";
    private static final byte[] keyValue = "Dxe2DdfMb4qLxsRNClClWQ==".getBytes(); // Necesitas una clave de 16 bytes

    public static String cifrar(String data) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITHM);
        keyGen.init(128);
        SecretKey secretKey = new SecretKeySpec(keyValue, ALGORITHM);

        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] encryptedData = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedData);
    }

    public static String descifrar(String encryptedData) throws Exception {
        SecretKey secretKey = new SecretKeySpec(keyValue, ALGORITHM);

        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        byte[] decryptedData = Base64.getDecoder().decode(encryptedData);
        byte[] originalData = cipher.doFinal(decryptedData);

        return new String(originalData);
    }
}


