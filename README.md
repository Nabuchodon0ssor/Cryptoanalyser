Final Project for Java Syntax Module: Cryptoanalyzer

Cryptoanalyzer is a program that works with the Caesar cipher. The English alphabet is used as the basis for the cryptographic alphabet.

What was accomplished from the main requirements:

The program can be launched via different scenarios set up in the Run Configuration:
- **Application** - starts the program and works via the console.
- **Encrypt** - encrypts the prepared file HarryPotter.
- **Decrypt** - decrypts the encrypted file Harry_Potter.txt[ENCRYPTED].
- **Brute-Force** - decrypts the encrypted file Harry_Potter.txt[ENCRYPTED] via brute force.

The program uses the Caesar cipher with a cyclic shift of the alphabet. 
Only English alphabet letters (uppercase and lowercase), as well as the characters '.', ',', '«', '»', '"', ''', ':', '!', '?', ' ' are encoded. 
After decryption, the text formatting is retained 100% (spaces, indentations, line breaks, punctuation, uppercase, and lowercase letters). 
The program uses the same key for correctly encoding and decoding the file. There is a brute-force mode to automatically select a key for the encrypted text and decrypt it.

What could not be accomplished: Brute-force mode with frequency analysis. Only one language (English) is available. The implemented brute-force mode works with a specific project text, Harry_Potter.txt.

Interesting solutions: The program can also be used via the IntelijIdea console, where you can manually enter the path to the text file and the key or directly input the text you want to encrypt/decrypt. The brute-force mode is not available for manually entered text. The project also provides the ability to select different configurations in the tools panel.
