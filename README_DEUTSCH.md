Finales Projekt für das Java-Syntax-Modul: Cryptoanalyzer

Cryptoanalyzer ist ein Programm, das mit dem Caesar-Verschlüsselungsverfahren arbeitet. 
Das englische Alphabet wird als Grundlage für das kryptographische Alphabet verwendet.

Was aus den Hauptanforderungen erreicht wurde:

Das Programm kann über verschiedene Szenarien, die in der Run Configuration eingerichtet wurden, gestartet werden:
- **Application** - startet das Programm und arbeitet über die Konsole.
- **Encrypt** - verschlüsselt die vorbereitete Datei HarryPotter.
- **Decrypt** - entschlüsselt die verschlüsselte Datei Harry_Potter.txt[ENCRYPTED].
- **Brute-Force** - entschlüsselt die verschlüsselte Datei Harry_Potter.txt[ENCRYPTED] durch Brute-Force.

Das Programm verwendet den Caesar-Verschlüsselungsalgorithmus mit einer zyklischen Verschiebung des Alphabets. 
Nur englische Buchstaben (Groß- und Kleinbuchstaben), sowie die Zeichen '.', ',', '«', '»', '"', ''', ':', '!', '?', ' ' werden kodiert. 
Nach der Entschlüsselung bleibt das Format des Textes zu 100% erhalten (Abstände, Einrückungen, Zeilenumbrüche, Interpunktion, Groß- und Kleinschreibung). 
Das Programm verwendet denselben Schlüssel zum richtigen Verschlüsseln und Entschlüsseln der Datei. Es gibt einen Brute-Force-Modus, 
der automatisch einen Schlüssel für den verschlüsselten Text auswählt und ihn entschlüsselt.

Was nicht erreicht wurde: Brute-Force-Modus mit Frequenzanalyse. Nur eine Sprache (Englisch) ist verfügbar. 
Der implementierte Brute-Force-Modus funktioniert mit einem spezifischen Projektext, Harry_Potter.txt.

Interessante Lösungen: Das Programm kann auch über die IntelijIdea-Konsole verwendet werden, in der man entweder den Pfad zur 
Textdatei und den Schlüssel manuell eingeben oder direkt den Text eingeben kann, den man verschlüsseln/entschlüsseln möchte. 
Der Brute-Force-Modus ist nicht für manuell eingegebenen Text verfügbar. Das Projekt bietet zudem die Möglichkeit, 
verschiedene Konfigurationen im Tools-Panel auszuwählen.

