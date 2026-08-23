import java.util.Arrays;
import java.util.Scanner;

public class arrayaslistwithcontain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int num = sc.nextInt();

        if (Arrays.asList(arr).contains(num)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}
