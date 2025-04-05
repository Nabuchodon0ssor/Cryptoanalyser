package com.javarush;


class WorkWithTerminal {
    FileService fs = new FileService();
    FileReader fr = new FileReader();
    FileWriter fw = new FileWriter();
    CaesarCipher cs = new CaesarCipher();
    BruteForce bf = new BruteForce();

    WorkWithTerminal() {
    }

    void encryptFile(String path, int key) {
        Texts.originalTextFromFile = this.fr.readTextFromFile(path);
        Texts.encryptedFileText = this.cs.encryptText(Texts.originalTextFromFile, key);
        FileService.filePathEncrypted = this.fs.createEncryptedFile(path);
        this.fw.writeTextToFile(Texts.encryptedFileText, FileService.filePathEncrypted);
    }

    void decryptFile(String path, int key) {
        Texts.encryptedFileText = this.fr.readTextFromFile(path);
        Texts.decryptedFileText = this.cs.decryptText(Texts.encryptedFileText, key);
        FileService.filePathDecrypted = this.fs.createDecryptedFile(path);
        this.fw.writeTextToFile(Texts.decryptedFileText, FileService.filePathDecrypted);
    }

    void bruteForce(String path) {
        Texts.encryptedFileText = this.fr.readTextFromFile(path);
        Texts.decryptedFileText = this.bf.bruteForce(Texts.encryptedFileText);
        FileService.filePathDecrypted = this.fs.createDecryptedFile(path);
        this.fw.writeTextToFile(Texts.decryptedFileText, FileService.filePathDecrypted);
    }
}
