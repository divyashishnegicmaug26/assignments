import java.util.Scanner;

public class Multipleofthree {
    int n;

    void multiple(int n) {
        this.n = n;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        Multipleofthree b = new Multipleofthree();
        b.multiple(n);
    }

}