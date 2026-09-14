package assignment1;
import java.util.Scanner;

public class daycl {
    private int data;
    private int month;
    private int years;
    public void setter(int data, int month , int years){
        while (month > 12) {
        month = month - 12;
        years++;
    }

    while (true) {

        int temp;

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            temp = 30;
        }
        else if (month == 2) {
            if (years % 400 == 0 ||
                (years % 4 == 0 && years % 100 != 0)) {
                temp = 29;
            }
            else {
                temp = 28;
            }
        }
        else {
            temp = 31;
        }

        if (data <= temp) {
            break;
        }

        data = data - temp;
        month++;

        if (month > 12) {
            month = 1;
            years++;
        }
    }

    this.data = data;
    this.month = month;
    this.years = years;
}
         public void adddays(int num) {

        int data1 = data + num;

        while (true) {

            int temp;

            // 30 months
            if (month == 4 || month == 6 ||
                month == 9 || month == 11) {

                temp = 30;
            }

            // 31 months
            else if (month == 1 || month == 3 || month == 5 ||
                     month == 7 || month == 8 ||
                     month == 10 || month == 12) {

                temp = 31;
            }

            // February  leap year
            else if (years % 400 == 0 ||
                     (years % 4 == 0 && years % 100 != 0)) {

                temp = 29;
            }

            // February  nonleap year
            else {

                temp = 28;
            }

            // data is now ok
            if (data1 <= temp) {
                break;
            }

            data1 = data1 - temp;

            month++;

            if (month > 12) {
                month = 1;
                years++;
            }
        }

        data = data1;
    }

        void addmonth(int num){
            month=month+num;
            while(month>12){
                month=month-12;
                years++;
            }
            
        }
        void addyears(int num){
            years = years+num;
         
        }
        public void display() {
    System.out.println(data + "/" + month + "/" + years);
}

        public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        daycl d = new daycl();

        while (true) {

            System.out.println("\n===== DATE MENU =====");
            System.out.println("1. Set Date");
            System.out.println("2. Add Days");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Display Date");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter date: ");
                    int a = sc.nextInt();

                    System.out.print("Enter month: ");
                    int b = sc.nextInt();

                    System.out.print("Enter year: ");
                    int v = sc.nextInt();

                    d.setter(a, b, v);
                    break;

                case 2:
                    System.out.print("Enter days: ");
                    int days = sc.nextInt();

                    d.adddays(days);
                    break;

                case 3:
                    System.out.print("Enter months: ");
                    int months = sc.nextInt();

                    d.addmonth(months);
                    break;

                case 4:
                    System.out.print("Enter years: ");
                    int years = sc.nextInt();

                    d.addyears(years);
                    break;

                case 5:
                    d.display();
                    break;

                case 6:
                    System.out.println("Program exited.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

