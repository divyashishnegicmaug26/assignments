import java.util.Scanner;

public class postiveandnegative {
    public static void main(String[] args) {
        int n = 6;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int positivesum = 0;
        int negativesum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positivesum++;

            } else if (arr[i] < 0) {
                negativesum++;
            } else {
                continue;
            }
        }
        System.out.println("positive number : " + positivesum);
        System.out.println("negative number : " + negativesum);
    }

}