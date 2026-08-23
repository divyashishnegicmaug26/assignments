import java.util.Scanner;

public class sum {
    int a;

    void sum(int a) {
        this.a = a;
        int actsum = 0;
        for (int i = 1; i <= this.a; i++) {
            actsum += this.a;

        }
        System.out.println(actsum);
    }

    public static void main(String[] args) {
        sum s = new sum();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        s.sum(sc.nextInt());

    }

}
