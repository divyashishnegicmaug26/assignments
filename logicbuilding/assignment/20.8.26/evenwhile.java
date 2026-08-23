public class evenwhile {
    int a;

    void even() {
        this.a = 1;
        while (this.a <= 50) {
            System.out.println(
                    (this.a % 2 == 0) ? this.a + ": is even" : this.a + " : is odd");
            a++;
        }
    }

    public static void main(String[] args) {
        evenwhile s = new evenwhile();
        s.even();
    }
}
