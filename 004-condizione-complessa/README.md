# Codice 004: If con condizione complessa

Il codice permette di vedere un `if` basato su un'espressione booleana complessa, composta da confronti, AND (`&&`), OR (`||`) e NOT (`!`).

## Struttura

```text
004-if-condizione-complessa/
  README.md
  .gitignore
  src/
    ComplexIfExample.java
```

## Compilazione ed esecuzione

Aprire un terminale in questa cartella ed eseguire:

```sh
javac -d out src/ComplexIfExample.java
java -cp out ComplexIfExample
```

## Spiegazione

L'esempio rappresenta una semplice regola di accesso:

```java
int age = 17;
boolean hasTicket = true;
boolean isAccompaniedByAdult = true;
boolean isBlocked = false;
```

La condizione dell'`if` è:

```java
if (hasTicket && !isBlocked && (age >= 18 || isAccompaniedByAdult))
```

La condizione è `true` solo se tutte queste parti sono vere:

- la persona ha il biglietto;
- la persona non è bloccata;
- la persona è maggiorenne oppure è accompagnata da un adulto.
