public class withintern {
    String name;

    withintern(String n) {
        this.name = n;
    }

    public static void main(String[] args) {
        withintern s = new withintern("hello");
        String s1 = s.intern();
        String s2 = "hello";
    }
}
