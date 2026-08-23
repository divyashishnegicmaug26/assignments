import java.util.Scanner;

public class Factorial {
    public static int factorialnum(int n) {
        int mul = 1;
        for (int i = n; i >= 1; i--) {
            mul *= i;
        }
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int result = factorialnum(n);
        System.out.print(result);
    }

}
