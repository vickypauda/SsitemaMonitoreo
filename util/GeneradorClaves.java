package com.example.SistemaMonitoreo.util;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class GeneradorClaves {

    public static String generarClaveAES() {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128); // Puedes cambiar a 192 o 256 bits si es necesario
            SecretKey secretKey = keyGen.generateKey();
            return Base64.getEncoder().encodeToString(secretKey.getEncoded());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error al generar la clave AES", e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Clave AES Generada: " + generarClaveAES());
    }
}

