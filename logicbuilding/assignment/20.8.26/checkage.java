import java.util.Scanner;

public class checkage {
    int a;

    String checkage(int a) {
        this.a = a;
        return ((a > 18) ? (a > 50) ? "senior citizen " : "adult" : "childern");

    }

    public static void main(String[] args) {
        checkage c = new checkage();
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        String n = c.checkage(age);
        System.out.println(n);
        ;
    }
}
