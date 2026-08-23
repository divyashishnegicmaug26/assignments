import java.util.Scanner;

public class sumof2usingmethod {
    int a;
    int b;

    int sum(int a, int b) {
        this.a = a;
        this.b = b;
        return (this.a + this.b);

    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        sumof2usingmethod sc = new sumof2usingmethod();

        int a = s.nextInt();
        int b = s.nextInt();
        int c = sc.sum(a, b);
        System.out.println("sum of a and b is " + c);
    }
}
