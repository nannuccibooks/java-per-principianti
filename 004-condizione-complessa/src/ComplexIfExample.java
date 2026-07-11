public class ComplexIfExample {
    public static void main(String[] args) {
        int age = 17;
        boolean hasTicket = true;
        boolean isAccompaniedByAdult = true;
        boolean isBlocked = false;

        if (hasTicket && !isBlocked && (age >= 18 || isAccompaniedByAdult)) {
            System.out.println("Accesso consentito.");
        } else {
            System.out.println("Accesso negato.");
        }
    }
}
