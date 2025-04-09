Final Project for Java Syntax Module: Cryptoanalyzer

Cryptoanalyzer is a program that works with the Caesar cipher. The English alphabet is used as the basis for the cryptographic alphabet.

What was accomplished from the main requirements:
The program can be launched in Terminal-Local through different Run Configurations:

Application - launches the program to work via the console.

Encrypt - encrypts the pre-prepared file Harry_Potter.txt.

Decrypt - decrypts the encrypted file Harry_Potter.txt[ENCRYPTED].

Brute-Force - decrypts the encrypted file Harry_Potter.txt[ENCRYPTED] using brute-force.

The program can encode and decode files using the Caesar cipher with a cyclic alphabet shift. Only English alphabet letters (uppercase and lowercase), and specific punctuation marks like '.', ',', '«', '»', '"', ''', ':', '!', '?', and spaces are encoded.

The content remains 100% formatted after decryption, preserving spaces, indentations, line breaks, punctuation, and letter casing.

The program uses the same key for correct encoding and decoding. It also includes a brute-force mode to automatically select a key for decryption, specifically tailored to the Harry_Potter.txt text.

Project features:

Can be launched by selecting one of the configurations in the IntelliJ IDEA tools panel.

What could not be accomplished:
Brute-force mode with frequency analysis.

The program currently supports only the English language.

The brute-force mode works with a specific text file (Harry_Potter.txt).
