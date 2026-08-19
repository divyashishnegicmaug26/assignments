import java.util.Scanner;

public class dayoftheweek {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the day");
        int day = s.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;

            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("A week has only 7 days");
                break;
        }
    }
}