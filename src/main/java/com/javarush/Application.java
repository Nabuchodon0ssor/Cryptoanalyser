package com.javarush;

class Application {

    public static void main(String[] args) {
        if (args.length < 2 || args.length > 3) {
            Console console = new Console();
            console.welcomeMenu();
            return;
        }

        WorkWithTerminal wwt = new WorkWithTerminal();
        String command = args[0];
        String filePath = args[1];

        switch (command) {
            case "ENCRYPT":
                if (args.length == 3) {
                    int key = Integer.parseInt(args[2]);
                    wwt.encryptFile(filePath, key);
                } else {
                    System.out.println("Error: ENCRYPT requires a key.");
                }
                break;

            case "DECRYPT":
                if (args.length == 3) {
                    int key = Integer.parseInt(args[2]);
                    wwt.decryptFile(filePath, key);
                } else {
                    System.out.println("Error: DECRYPT requires a key.");
                }
                break;

            case "BRUTE_FORCE":
                if (args.length == 2) {
                    wwt.bruteForce(filePath);
                } else {
                    System.out.println("Error: BRUTE_FORCE requires a key.");
                }
                break;

            default:
                System.out.println("Error: unknown command " + command);
                break;
        }
    }
}