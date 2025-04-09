package com.javarush;

import java.util.ArrayList;
import java.util.stream.Collectors;

class BruteForce {

    CaesarCipher cs = new CaesarCipher();
    public static int bruteForceKey;

    BruteForce() {
    }

    int keyFinder(ArrayList<Character> inputtedEncryptedText) {
        int bestKey = 0;
        int bestScore = -1;

        String[] commonWords = {"the", "and", "is", "it", "of", "to"};
        String[] commonPhrases = {"hello", "world", "this is", "how are"};

        for (int i = 1; i <= 26; i++) {
            ArrayList<Character> decryptedText = this.cs.decryptText(inputtedEncryptedText, i);

            String decryptedString = decryptedText.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining());

            int score = 0;

            for (String word : commonWords) {
                if (decryptedString.contains(word)) {
                    score += 5;
                }
            }

            for (String phrase : commonPhrases) {
                if (decryptedString.contains(phrase)) {
                    score += 10;
                }
            }

            score += (int) (decryptedString.chars().filter(ch -> ch == ' ').count() * 2);  // Пробелы важны

            System.out.println("Key " + i + " score: " + score);

            if (score > bestScore) {
                bestScore = score;
                bestKey = i;
            }
        }


        System.out.println("Best key found: " + bestKey + " with score: " + bestScore);
        return bestKey;
    }

    ArrayList<Character> bruteForce(ArrayList<Character> inputtedEncryptedText) {
        bruteForceKey = this.keyFinder(inputtedEncryptedText);
        return this.cs.decryptText(inputtedEncryptedText, bruteForceKey);
    }
}
