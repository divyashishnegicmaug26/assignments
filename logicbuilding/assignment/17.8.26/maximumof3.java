public class maximumof3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 9;
        if (a > b && a > c) {
            System.out.println("a is the greatest " + a);
        } else {
            if (b > a && b > c) {
                System.out.println("b is greatest " + b);
            } else {
                System.out.println("c is the greatest" + c);
            }
        }

    }
}
