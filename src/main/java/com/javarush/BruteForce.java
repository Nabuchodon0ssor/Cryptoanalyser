package com.javarush;

import java.util.ArrayList;

class BruteForce {
    CaesarCipher cs = new CaesarCipher();
    public static int bruteForceKey;

    BruteForce() {
    }

    int keyFinder(ArrayList<Character> inputtedEncryptedText) {
        int key = 0;
        int counter = 0;

        for(int i = 1; i <= Constants.ALPHABET_EN.size(); ++i) {
            ArrayList<Character> decryptedText = this.cs.decryptText(inputtedEncryptedText, i);
            int amountOfPointsAndSpaces = 0;

            for(char chars : decryptedText) {
                if (chars == '!' && (Character)decryptedText.get(decryptedText.indexOf(chars) + 1) == 8217) {
                    ++amountOfPointsAndSpaces;
                }

                if (chars == '?' && (Character)decryptedText.get(decryptedText.indexOf(chars) + 1) == 8217) {
                    ++amountOfPointsAndSpaces;
                }
            }

            if (amountOfPointsAndSpaces > counter) {
                counter = amountOfPointsAndSpaces;
                key = i;
            }
        }

        return key;
    }

    ArrayList<Character> bruteForce(ArrayList<Character> inputtedEncryptedText) {
        bruteForceKey = this.keyFinder(inputtedEncryptedText);
        return this.cs.decryptText(inputtedEncryptedText, bruteForceKey);
    }
}
