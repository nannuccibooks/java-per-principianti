public class IfElseOrExample {
    public static void main(String[] args) {
        boolean isWeekend = false;
        boolean isHoliday = true;

        if (isWeekend || isHoliday) {
            System.out.println("Puoi riposarti: oggi non e' un normale giorno di lavoro.");
        } else {
            System.out.println("Oggi e' un normale giorno di lavoro.");
        }
    }
}
