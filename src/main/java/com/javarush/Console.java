package com.javarush;

import java.util.Scanner;

class Console {
    Scanner scan;
    ConsoleTextService cts;
    FileService fs;
    FileWriter fw;
    CaesarCipher cs;
    BruteForce bf;
    WorkWithTerminal wwt;

    Console() {
        this.scan = new Scanner(System.in);
        this.cts = new ConsoleTextService();
        this.fs = new FileService();
        this.fw = new FileWriter();
        this.cs = new CaesarCipher();
        this.bf = new BruteForce();
        this.wwt = new WorkWithTerminal();
    }

    void welcomeMenu() {
        System.out.println("Welcome to the Text Encryption Software! Please write as number: \n1. If You want to input the text into the console \n2. If You want to choose a File with a text \n");
        int number = Integer.parseInt(this.scan.nextLine());
        if (number == 1) {
            this.consoleTextMenu();
        }

        if (number == 2) {
            this.consoleFileMenu();
        } else {
            this.welcomeMenu();
        }

    }

    void consoleTextMenu() {
        System.out.println("Please input the text. When the whole text is inputted, please write <<END>> from a new line");
        Texts.inputtedInitialText = this.cts.readInputtedText();
        System.out.println("The inputted text is: \n" + this.cts.getStringRepresentation(Texts.inputtedInitialText));
        System.out.println("Please input the encryption key: ");
        CaesarCipher.key = Integer.parseInt(this.scan.nextLine());
        System.out.println("The encryption key is: " + CaesarCipher.key);
        Texts.inputtedTextEncrypted = this.cs.encryptText(Texts.inputtedInitialText, CaesarCipher.key);
        System.out.println("The encrypted text is: \n" + this.cts.getStringRepresentation(Texts.inputtedTextEncrypted));

        while(true) {
            System.out.println("Do You want to decrypt encrypted text back? Yes(1), No(2)");
            int number = Integer.parseInt(this.scan.nextLine());
            if (number == 2) {
                System.out.println("Thank You for using this software!");
                break;
            }

            if (number == 1) {
                Texts.inputtedTextDecrypted = this.cs.decryptText(Texts.inputtedTextEncrypted, CaesarCipher.key);
                System.out.println("The decrypted text is: " + this.cts.getStringRepresentation(Texts.inputtedTextDecrypted));
                System.out.println("Thank You for using this software!");
                break;
            }
        }

    }

    void consoleFileMenu() {
        System.out.println("Please input the file path. \nExample: E:\\\\Java\\\\GitProjects\\\\dimitri.pasunkov.encoder.dev\\\\src\\\\main\\\\resources\\\\Harry_Potter.txt");
        FileService.originalFilePath = this.scan.nextLine();
        System.out.println("The file path is: " + FileService.originalFilePath);
        System.out.println("Please input the encryption key: ");
        CaesarCipher.key = Integer.parseInt(this.scan.nextLine());
        System.out.println("The encryption key is: " + CaesarCipher.key);
        this.wwt.encryptFile(FileService.originalFilePath, CaesarCipher.key);
        System.out.println("The new file with encrypted text is: " + FileService.filePathEncrypted);

        while(true) {
            System.out.println("Do You want to decrypt encrypted file: \nWith the same key (1) \nUsing brute force method? (2) \nEnd working with program (3)");
            int number = this.scan.nextInt();
            if (number == 3) {
                System.out.println("Thank You for using this software!");
                break;
            }

            if (number == 1) {
                this.consoleFileMenu1();
                break;
            }

            if (number == 2) {
                this.consoleFileMenu2();
                break;
            }
        }

    }

    void consoleFileMenu1() {
        Texts.decryptedFileText = this.cs.decryptText(Texts.encryptedFileText, CaesarCipher.key);
        FileService.filePathDecrypted = this.fs.createDecryptedFile(FileService.filePathEncrypted);
        this.fw.writeTextToFile(Texts.decryptedFileText, FileService.filePathDecrypted);
        System.out.println("The new file with decrypted text is: " + FileService.filePathDecrypted);
        System.out.println("Thank You for using this software!");
    }

    void consoleFileMenu2() {
        Texts.decryptedFileText = this.bf.bruteForce(Texts.encryptedFileText);
        FileService.filePathDecrypted = this.fs.createDecryptedFile(FileService.filePathEncrypted);
        this.fw.writeTextToFile(Texts.decryptedFileText, FileService.filePathDecrypted);
        System.out.println("The new file with decrypted text (using brute force method) is: " + FileService.filePathDecrypted);
        System.out.println("Thank You for using this software!");
    }
}
