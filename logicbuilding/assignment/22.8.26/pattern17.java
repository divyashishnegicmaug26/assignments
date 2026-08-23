public class pattern17 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            int start = 1;
            for (int j = 1; j <= i; j++) {
                if (j < i) {
                    System.out.print(start + "*");
                    start += 2;
                } else {
                    System.out.print(start);
                }
            }
            System.out.println();
        }

    }
}