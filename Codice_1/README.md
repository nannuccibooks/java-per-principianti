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
(da finire...)