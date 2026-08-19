public class Leapyear {
    public static void main(String[] args) {
        int year1 = 2004;
        int year2 = 1900;
        if (year1 % 4 == 0 && year1 % 100 != 0 || year1 % 100 != 0) {
            System.out.println("leap year");
        } else {
            System.out.println("now a leap year");
        }
    }

}
