# Codice 003: If-else con OR

Il codice permette di vedere una condizione `if-else` in cui l'`if` usa un'espressione booleana con l'operatore OR (`||`).

## Struttura

```text
003-if-else-or/
  README.md
  .gitignore
  src/
    IfElseOrExample.java
```

## Compilazione ed esecuzione

Aprire un terminale in questa cartella ed eseguire:

```sh
javac -d out src/IfElseOrExample.java
java -cp out IfElseOrExample
```

## Spiegazione

L'esempio usa due variabili booleane:

```java
boolean isWeekend = false;
boolean isHoliday = true;
```

La condizione dell'`if` è:

```java
if (isWeekend || isHoliday)
```

L'operatore OR (`||`) restituisce `true` se almeno una delle due espressioni è `true`. In questo caso `isHoliday` vale `true`, quindi viene eseguito il ramo dell'`if`.
