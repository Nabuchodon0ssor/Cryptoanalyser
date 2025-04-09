package com.javarush;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
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
        System.out.println("Welcome to the Text Encryption Software! Please write as number: \n" +
                "1. If You want to input the text into the console \n" +
                "2. If You want to choose a File with a text \n");
        int number = Integer.parseInt(this.scan.nextLine());

        if (number == 1) {
            this.consoleTextMenu();
        } else if (number == 2) {
            this.consoleFileMenu();
        } else {
            System.out.println("Invalid input. Please choose 1 or 2.");
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
        System.out.println("Please input the file path:\nExample: \n" +
                "Harry_Potter.txt (if the file is directly in the 'resources' folder) or \n" +
                "C:\\Users\\Me\\Documents\\Harry_Potter.txt (for an absolute path).");

        String inputPath = scan.nextLine();

        System.out.println("Choose an option:\n1. Encrypt\n2. Decrypt\n3. Brute Force");
        int option = Integer.parseInt(scan.nextLine());

        if (option == 1) {
            System.out.println("Please input the encryption key:");
            int key = Integer.parseInt(scan.nextLine());

            wwt.encryptFile(inputPath, key);
            System.out.println("File encrypted successfully!");

            // 🔹 ВОЗВРАЩАЕМ ВОПРОС ПРО ДЕШИФРОВКУ
            System.out.println("Do you want to decrypt the encrypted file now? (Yes - 1, No - 2)");
            int decryptChoice = Integer.parseInt(scan.nextLine());

            if (decryptChoice == 1) {
                wwt.decryptFile(FileService.filePathEncrypted, key);
                System.out.println("Decryption complete! Check the file.");
            }

        } else if (option == 2) {
            System.out.println("Please input the encryption key:");
            int key = Integer.parseInt(scan.nextLine());

            wwt.decryptFile(inputPath, key);
            System.out.println("File decrypted successfully!");

        } else if (option == 3) {
            wwt.bruteForce(inputPath);
            System.out.println("Brute Force decryption complete!");

        } else {
            System.out.println("Invalid option. Please restart.");
        }
    }

}
