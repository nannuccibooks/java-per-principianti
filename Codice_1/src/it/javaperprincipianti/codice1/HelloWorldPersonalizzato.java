package it.javaperprincipianti.codice1;

/**
 * Variante dell'esempio "Hello World" che accetta un nome via argomento.
 */
public class HelloWorldPersonalizzato {
    public static void main(String[] args) {
        String destinatario = args.length > 0 ? args[0] : "mondo";
        System.out.println("Ciao, " + destinatario + " da Codice_1!");
    }
}
