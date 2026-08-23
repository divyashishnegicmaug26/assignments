import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int cnt = 0;
        for (int i = 0; i <= a.length() - 1; i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
                    || a.charAt(i) == 'u') {
                cnt++;
            }
        }
        System.out.println("the count of vowels is " + cnt);
    }
}
