package it.javaperprincipianti.codice1;

public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5; // 00000000 00000000 00000000 00000101
        int b = 3; // 00000000 00000000 00000000 00000011
        int c = -5; // 11111111 11111111 11111111 11111011

        // AND bitwise (&)
        int r1 = a & b;
        // a: 00000101
        // b: 00000011
        // &: 00000001 -> 1

        // OR bitwise (|)
        int r2 = a | b;
        // a: 00000101
        // b: 00000011
        // |: 00000111 -> 7

        // XOR bitwise (^)
        int r3 = a ^ b;
        // a: 00000101
        // b: 00000011
        // ^: 00000110 -> 6

        // NOT bitwise (~)
        int r4 = ~a;
        // a: 00000000 00000000 00000000 00000101
        // ~a: 11111111 11111111 11111111 11111010 -> -6 (Complemento a due)

        // Shift a sinistra (<<)
        int r5 = a << 1;
        // a: 00000101
        // <<1: 00001010 -> 10 (moltiplicazione per 2)

        // Shift a destra aritmetico (>>)
        int r6 = a >> 1;
        // a: 00000101
        // >>1: 00000010 -> 2 (divisione intera per 2)

        // Shift a destra logico (>>>)
        int r7 = c >>> 1;
        // c: 11111111 11111111 11111111 11111011
        // >>>1: 01111111 11111111 11111111 11111101 -> 2147483645
        // NOTA: Il bit di segno viene riempito con 0

        // Stampa dei risultati
        System.out.println("AND (&):      " + r1);
        System.out.println("OR (|):       " + r2);
        System.out.println("XOR (^):      " + r3);
        System.out.println("NOT (~):      " + r4);
        System.out.println("<< 1:         " + r5);
        System.out.println(">> 1:         " + r6);
        System.out.println(">>> 1:        " + r7);
    }
}
