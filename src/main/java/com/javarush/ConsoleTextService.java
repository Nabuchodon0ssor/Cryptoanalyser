package com.javarush;

import java.util.ArrayList;
import java.util.Scanner;

class ConsoleTextService {
    Scanner scanner;

    ConsoleTextService() {
        this.scanner = new Scanner(System.in);
    }

    ArrayList<Character> readInputtedText() {
        ArrayList<Character> inputtedText = new ArrayList();

        while(true) {
            String line = this.scanner.nextLine();
            if (line.equals("END")) {
                return inputtedText;
            }

            char[] chars = line.toCharArray();

            for(char ch : chars) {
                inputtedText.add(ch);
            }

            inputtedText.add('\n');
        }
    }

    String getStringRepresentation(ArrayList<Character> list) {
        StringBuilder builder = new StringBuilder(list.size());

        for(Character ch : list) {
            builder.append(ch);
        }

        return builder.toString();
    }
}
