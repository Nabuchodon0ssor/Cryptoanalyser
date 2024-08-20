Abschlussprojekt für das Modul Java Syntax: Kryptoanalysator

Der Kryptoanalysator ist ein Programm, das mit dem Caesar-Verschlüsselungsverfahren arbeitet. Das englische Alphabet dient als Grundlage für das kryptografische Alphabet.

Was aus den Hauptanforderungen erreicht wurde:

Das Programm wurde im Jar-Format kompiliert. Die Jar-Datei wurde im Releasbereich auf GitHub platziert.
Das Programm kann im Terminal-Local gestartet werden, indem Argumente übergeben werden: [ENCRYPT, DECRYPT, BRUTE_FORCE]
(zum Beispiel: java -jar E:\JavaRush\dimitri.pasunkov.encoder\out\artifacts\dimitri_pasunkov_encoder_jar\dimitri.pasunkov.encoder.jar ENCRYPT E:\JavaRush\dimitri.pasunkov.encoder\src\main\java\com\javarush\Harry_Potter.txt 56)
Als Ergebnis erscheint im Ordner mit der ursprünglichen Datei eine Datei mit demselben Namen wie die Eingabedatei, jedoch mit dem Hinweis [ENCRYPTED] / [DECRYPTED], abhängig von der durchgeführten Operation.
Der Dateiinhalt wird mit dem Caesar-Verschlüsselungsverfahren codiert/decodiert. Die Verschiebung im Alphabet ist zyklisch.
Es werden nur Buchstaben des englischen Alphabets (Groß- und Kleinbuchstaben) sowie '.', ',', '«', '»', '"', ''', ':', '!', '?', ' ' codiert.
Nach der Entschlüsselung bleibt das Format des Textes zu 100% erhalten (Leerzeichen, Einzüge, Zeilenumbrüche, Zeichen, Groß- und Kleinbuchstaben).
Das Programm verwendet denselben Schlüssel für die korrekte Codierung und Decodierung der Datei.
Das Programm verfügt über einen Brute-Force-Modus zur automatischen Schlüsselauswahl für den verschlüsselten Text und dessen Entschlüsselung.
Der Programmcode und die kompilierte Jar-Datei sind auf GitHub verfügbar.

Was nicht erreicht werden konnte:
Brute-Force-Modus mit Frequenzanalyse.
Es ist nur eine Sprache (Englisch) verfügbar.
Der implementierte Brute-Force-Modus funktioniert mit einem spezifischen Projekttest, Harry_Potter.txt.

Interessante implementierte Lösungen:
Mit dem Programm kann auch in der IntelijIdea-Konsole gearbeitet werden (man kann den Pfad zur Textdatei und den Schlüssel manuell eingeben oder den zu verschlüsselnden/entschlüsselnden Text direkt in die Konsole eingeben. Der Brute-Force-Modus ist für manuell eingegebenen Text nicht verfügbar).
Projektspezifikationen:

Das Programm kann auch gestartet werden, indem eine der Konfigurationen im Werkzeugbereich ausgewählt wird.
