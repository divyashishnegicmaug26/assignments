import java.util.Scanner;

public class enterpositive {
    int a;
    Scanner sc = new Scanner(System.in);

    String typepositive(int a) {
        this.a = a;
        do {
            if (this.a < 0) {
                System.out.println("Try again");
                this.a = sc.nextInt();
            }

        } while (this.a < 0);
        return "BOOM! this is positive : " + this.a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        enterpositive s = new enterpositive();
        int c = sc.nextInt();
        String result = s.typepositive(c);
        System.out.println(result);
    }

}
