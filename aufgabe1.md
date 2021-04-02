Erstelle eine _abstrakte_ Klasse namens **Ball** mit den Attributen _luftKapazitaet_ und _rundung_, beide als Integer.

```java
abstract class Ball
```

Eine Funktion namens aufpumpen mit einem Eingabeparameter namens _luftMenge_ als Integer.

```java
void aufpumpen(int luftMenge)
```

Die Funktion soll bei vollständig aufgeblasenen **Ball** „Ich bin voll!“ und im anderen Fall „Es gibt noch Platz zu füllen.“ ausgeben.
```java
if(vollständig aufgeblasen)
{
    // Ich bin voll!
}
else
{
    // Es gibt noch Platz zu füllen.
}
```

Erstelle dann zwei vom **Ball erbende Ballklassen** deiner Wahl (zb. Handball und Fußball).
Gebe beiden neuen Klassen ein weiteres beliebiges Attribut.

```java
class Handball extends Ball
```

- Die erste Klasse soll bei 10 luftMengen-Einheiten voll sein (also _luftKapazitaet_ = 10).

- Die zweite Klasse bei 15 luftMengen-Einheiten voll sein (also _luftKapazitaet_ = 15).



Eine Main.java-Datei zum Testen natürlich auch.

Hier sollst du annehmen beide **Bälle** sind leer und deine Aufgabe ist es die beiden erzeugten **Bälle** mit je 10 luftMengen-Einheiten zu füllen.

```java
ball1.aufpumpen(10);

ball2.aufpumpen(10);
```