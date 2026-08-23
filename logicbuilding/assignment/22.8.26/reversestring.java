public class reversestring {
    public static void main(String[] args) {
        String s = "ashu";
        int n = s.length() - 1;

        for (int i = n; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }

    }

}
