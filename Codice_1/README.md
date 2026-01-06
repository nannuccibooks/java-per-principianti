# Codice 1
Il codice permette di vedere in azione gli **Operatori Bitwise**.

## Spiegazione riga per riga
Ignorando le parti "strutturali" del codice (`package`, `public class BitwiseExample`, `public static void main(String[] args)`) che affronteremo in seguito nel libro, concentriamoci sulle operazioni svolte alle righe da 5 a 55 (estremi compresi).

- Le righe 5-7 introducono le variabili intere (`int`) `a`, `b`, `c` a cui vengono assegnati (rispettivamente) i valori `5`, `3` e `-5`.
```java
int a = 5;
int b = 3;
int c = -5;
```
    
- In rappresentazione binaria, questi numeri sono interi a 32 bit, perciò 32 elementi che possono assumere il valore `0` oppure `1`, secondo la logica della _Rappresentazione binaria_ con _Complemento a due_ vista nel libro. Si ha perciò che:
    - $5$ è pari a `00000000 00000000 00000000 00000101`
    - $3$ è pari a `00000000 00000000 00000000 00000011`
    - $-5$ è pari a `11111111 11111111 11111111 11111011`.
- La riga 10 introduce la variabile intera (`int`) `r1` assegnandole il risultato dell'operazione di AND Bitwise tra le variabili `a` e `b` definite prima:
```java
int r1 = a & b;
```
- I commenti delle righe 11-13 mostrano come questa operazione funzioni come indicato nella teoria del libro: il risultato è infatti un nuovo numero i cui bit sono `1` se entrambi i bit corrispondenti degli operandi coinvolti erano `1`. È così solo per il bit meno significativo (LSB = _Least Significant Bit_) che infatti è `1` nel risultato. Per tutti gli altri, i nuovi bit sono tutti `0`. La rappresentazione finale è perciò fatta di tutti bit a `0` tranne il LSB a `1`, che in codifica binaria vale proprio $1$ (poiché $1\cdot 2^0=1$). La riga 49 stampa il risultato in modo chiaro in console.

- La riga 16 introduce la variabile intera (`int`) `r2` assegnandole il risultato dell'operazione di OR Bitwise tra le variabili `a` e `b` definite prima:
```java
int r2 = a | b;
```
- I commenti delle righe 17-19 mostrano come questa operazione funzioni come indicato nella teoria del libro: il risultato è un nuovo numero i cui bit sono a `1` solo se entrambi i bit corrispondenti degli operandi erano `1`. Operando sulle rappresentazioni binarie di $5$ e $3$, il risultato che si ottiene da questa operazione è `00000111` (considerando solo il byte più significativo), ossia $7$ poiché $1\cdot 2^2 + 1\cdot 2^1 + 1\cdot 2^0 = 7$. La riga 50 stampa il risultato in modo chiaro in console.

- La riga 22 introduce la variabile intera (`int`) `r3` assegnandole il risultato dell'operazione di XOR Bitwise tra le variabili `a` e `b` definite prima:
```java
int r3 = a ^ b;
```
- I commenti delle righe 23-25 mostrano come questa operazione funzioni come indicato nella teoria del libro: il risultato è un nuovo numero i cui bit sono a `1` solo se il bit corrispondente di uno dei due operandi è `1`, mentre è `0` se entrambi i bit corrispondenti sono uguali. Operando sulle rappresentazioni binarie di $5$ e $3$ si ottiene `00000110` (considerando solo il byte più significativo), ossia $6$ poiché $1\cdot 2^2 + 1\cdot 2^1 + 0\cdot 2^0 = 6$. La riga 51 stampa il risultato in modo chiaro in console.

- La riga 28 introduce la variabile intera (`int`) `r4` assegnandole il risultato dell'operazione di NOT Bitwise sulla variabile `a` definita prima:
```java
int r4 = ~a;
```
- I commenti delle righe 29-30 mostrano come questa operazione funzioni come indicato nella teoria del libro: il risultato è un nuovo numero i cui bit sono invertiti rispetto al numero su cui è stato applicato l'operatore. Operando sulla rappresentazione binaria di $5$, si ottiene `11111111 11111111 11111111 11111010`, ossia il numero $-6$, a causa del _Complemento a Due_. La riga 52 stampa il risultato in modo chiaro in console.

- La riga 33 introduce la variabile intera (`int`) `r5` assegnandole il risultato dell'operazione di Shift a sinistra di `1` posizione sulla variabile `a` definita prima:
```java
int r5 = a << 1;
```
- I commenti delle righe 34-35 mostrano come questa operazione funzioni come indicato nella teoria del libro: il risultato è un nuovo numero i cui bit sono "spostati" verso sinistra del numero di posizioni indicate, introducendo nuovi bit a `0` nella posizione del LSB. Operando sulla rappresentazione binaria di $5$, si ottiene `00001010`, ossia $10$ poiché $1\cdot 2^3 + 0\cdot 2^2 + 1\cdot 2^1 + 0\cdot 2^0 = 10$. È come se avessimo moltiplicato per $2$ il valore originale. La riga 53 stampa il risultato in modo chiaro in console.

- La riga 38 introduce la variabile intera (`int`) `r6` assegnandole il risultato dell'operazione di Shift a destra aritmetico di `1` posizione sulla variabile `a` definita prima:
```java
int r6 = a >> 1;
```
- I commenti delle righe 39-40 mostrano come questa operazione funzioni come indicato nella teoria del libro: il risultato è un nuovo numero i cui bit sono "spostati" verso destra del numero di posizioni indicate, introducendo dei bit a `0` a sinistra nella posizione successiva a quella del bit di segno che rimane invariato. Operando sulla rappresentazione binaria di $5$, si ottiene `00000010`, ossia $2$, poiché $1\cdot 2^1 + 0\cdot 2^0 = 2$. È come se avessimo eseguito la divisione intera per $2$ del valore originale. La riga 54 stampa il risultato in modo chiaro in console.

- La riga 43 introduce la variabile intera (`int`) `r7` assegnandole il risultato dell'operazione di Shift a destra logico di `1` posizione sulla variabile `c` definita prima:
```java
int r7 = c >>> 1;
```
- I commenti delle righe 44-46 mostrano come questa operazione funzioni come indicato nella teoria del libro: il risultato è un nuovo numero i cui bit sono "spostati" verso destra del numero di posizioni indicate, introducendo dei bit a `0` a sinistra, nella posizione del bit più significativo (MSB = _Most Significant Bit_). Tuttavia, il bit più significativo è quello che determina il segno: cambiarlo in `0` modifica perciò il segno del numero finale. Operando sulla rappresentazione binaria di $-5$, si ottiene `01111111 11111111 11111111 11111101`, ossia $2147483645$. La riga 55 stampa il risultato in modo chiaro in console.