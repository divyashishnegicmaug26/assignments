import java.util.Scanner;

public class bigswtich {
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;

    void gradeandaverage(int a, int b, int c) {
        int maths = a;
        int science = b;
        int history = c;
        int total = maths + science + history;
        int average = total / 3;
        if (average > 90) {
            System.out.println("grade a" + average);

        } else if (average >= 70 && average <= 89) {
            System.out.println("Grade b " + average);

        } else if (average <= 69 && average >= 50) {
            System.err.println(" Grade c" + average);

        } else if (average <= 49 && average >= 30) {
            System.out.println("Grade c " + average);
        } else {
            System.out.println("fails");
        }
    }

    void leapyear(int year) {
        int year1 = year;
        if ((year1 % 4 == 0 && year1 % 100 != 0) || year1 % 100 != 0) {
            System.out.println("leap year");
        } else {
            System.out.println("now a leap year");
        }
    }

    void dayoftheweek(int a) {

        int day = a;
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

    void display() {
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
        System.out.println(this.d);
        System.out.println(this.e);
        System.out.println(this.f);
        System.out.println(this.g);

    }

    public static void main(String[] args) {
        bigswtich s = new bigswtich();
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "enter program name " + " (1)gradeandaverage" + "  (2)leapyear" + "  (3)dayoftheweek" + "  (4)display");
        String program = sc.nextLine();

        switch (program) {
            case "gradeandaverage":
                System.out.println("enter first subject");
                int a = sc.nextInt();
                System.out.println("enter second subject");
                int b = sc.nextInt();
                System.out.println("enter third subject");
                int c = sc.nextInt();
                s.gradeandaverage(a, b, c);
                break;

            case "leapyear":
                System.out.println("enter year");
                int d = sc.nextInt();
                s.leapyear(d);
                break;

            case "dayoftheweek":
                System.out.println("enter day");
                int e = sc.nextInt();
                s.dayoftheweek(e);
                break;

            case "display":
                s.display();
                break;

        }
    }

}
