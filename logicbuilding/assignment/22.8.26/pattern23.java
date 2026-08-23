public class pattern23 {
    public static void main(String[] args) {
        int n = 5;
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n - k; i++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * k - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int k = n - 1; k >= 1; k--) {
            for (int i = 1; i <= n - k; i++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * k - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
