import java.util.Arrays;
import java.util.Scanner;

public class sortedidx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.print("Enter value to search: ");
        int value = sc.nextInt();

        int index = Arrays.binarySearch(arr, value);

        if (index >= 0) {
            System.out.println("Value found at index: " + index);
        } else {
            System.out.println("Value not found");
        }

        sc.close();
    }
}