package com.javarush;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

class FileReader {
    FileReader() {
    }


    ArrayList<Character> readTextFromFile(String filePath) {
        ArrayList<Character> text = new ArrayList<>();

        try {
            InputStream is = getClass().getClassLoader().getResourceAsStream(filePath);
            Scanner scanner;

            if (is != null) {
                scanner = new Scanner(is);
            } else {
                File file = new File(filePath);
                scanner = new Scanner(file);
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (char ch : line.toCharArray()) {
                    text.add(ch);
                }
                text.add('\n');
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("File not found: " + filePath);
        }

        return text;
    }

}
