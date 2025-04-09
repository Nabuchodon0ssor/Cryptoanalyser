package com.javarush;

import java.nio.file.Files;
import java.nio.file.Path;

class FileService {
    public static String filePathEncrypted = null;
    public static String filePathDecrypted = null;

    String createEncryptedFile(String originalFilePath) {
        Path originalPath = Path.of(originalFilePath);
        Path encryptedPath = originalPath.resolveSibling(originalPath.getFileName() + "[ENCRYPTED]");

        try {
            Files.deleteIfExists(encryptedPath);
            Files.createFile(encryptedPath);
        } catch (Exception e) {
            System.out.println("Error creating encrypted file: " + e.getMessage());
        }

        return encryptedPath.toString();
    }

    String createDecryptedFile(String filePath) {
        Path path = null;

        try {
            Files.deleteIfExists(Path.of(filePath + "[DECRYPTED]"));
            path = Files.createFile(Path.of(filePath + "[DECRYPTED]"));
        } catch (Exception var4) {
            System.out.println("File not found");
        }

        return path != null ? path.toString() : null;
    }
}
