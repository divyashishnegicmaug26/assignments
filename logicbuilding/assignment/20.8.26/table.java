import java.util.Scanner;

public class table {
    int a;

    void multiply(int a) {
        this.a = a;
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.a + " * " + i + "  " + this.a * i);
        }
    }

    public static void main(String[] args) {
        table s = new table();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        s.multiply(a);
    }

}
