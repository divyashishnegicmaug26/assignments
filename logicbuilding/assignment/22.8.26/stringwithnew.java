public class stringwithnew {
    String name;

    public static void main(String[] args) {
        String s = new String("hello");
        String s2 = new String("hello");
        System.out.println(s == s2);
        System.out.println(s2.equals(s));
    }
}
