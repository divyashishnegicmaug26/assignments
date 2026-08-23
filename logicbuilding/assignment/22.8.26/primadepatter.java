public class primadepatter {
    public static void main(String[] args) {

        int n = 3;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int l = 1; l <= 2 * i - 1; l++) {
                System.out.print("*");
            }

            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}