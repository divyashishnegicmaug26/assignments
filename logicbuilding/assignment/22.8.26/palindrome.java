import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int tag = 1;
        int n = 0;
        int m = a.length() - 1;
        while (n < m) {
            if (a.charAt(n) == a.charAt(m)) {
                tag = 1;
            } else {
                tag = 0;
                break;
            }
            n++;
            m--;

        }
        if (tag == 1) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("it is not a palindrome");
        }

    }

}
