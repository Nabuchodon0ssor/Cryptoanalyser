Final Project for Java Syntax Module: Cryptoanalyzer

Cryptoanalyzer is a program that works with the Caesar cipher. The English alphabet is used as the basis for the cryptographic alphabet.

What was accomplished from the main requirements:

The program is compiled into a jar format. The jar file is placed in the releases section on GitHub.
The program can be launched in Terminal-Local by passing arguments: [ENCRYPT, DECRYPT, BRUTE_FORCE]
(for example: java -jar E:\JavaRush\dimitri.pasunkov.encoder\out\artifacts\dimitri_pasunkov_encoder_jar\dimitri.pasunkov.encoder.jar ENCRYPT E:\JavaRush\dimitri.pasunkov.encoder\src\main\java\com\javarush\Harry_Potter.txt 56)
As a result, a file with the same name as the original file but marked as [ENCRYPTED] / [DECRYPTED] depending on the performed operation appears in the folder with the initial file.
The file content is encoded/decoded using the Caesar cipher. The alphabet shift is cyclic.
Only English alphabet letters (uppercase and lowercase), as well as '.', ',', '«', '»', '"', ''', ':', '!', '?', ' ', are encoded.
After decryption, the text retains the original formatting 100% (spaces, indentations, line breaks, punctuation, uppercase, and lowercase letters).
The program uses the same key for correctly encoding and decoding the file.
The program has a brute-force mode for automatically selecting a key for the encrypted text and decrypting it.
The program code and the compiled jar file are available on GitHub.

What could not be accomplished:
Brute-force mode with frequency analysis.
Only one language (English) is available.
The implemented brute-force mode works with a specific project text, Harry_Potter.txt.

Interesting solutions implemented:
The program can be used in the IntelijIdea console (you can manually enter the path to the text file and the key, or directly enter the text you want to encrypt/decrypt into the console. The brute-force mode is not available for manually entered text).
Project features:

The program can also be launched by selecting one of the configurations in the tools panel.
