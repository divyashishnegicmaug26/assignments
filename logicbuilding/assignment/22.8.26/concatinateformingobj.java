public class concatinateformingobj {
    String name;

    concatinateformingobj(String n) {
        this.name = n;
    }

    public static void main(String[] args) {
        String s = "hello";
        String s2 = "world";
        String s3 = s + s2;
        String s4 = "hello world";
        String s5 = s3.intern();
        System.out.println(s5 == s3);
        System.out.println(s3 == s);

    }
}
