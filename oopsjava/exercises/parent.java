package assignment3;
//inhetied nested classes
public class parent {

    void display() {
        System.out.println("this is parent");
    }

    static class child extends parent {

        @Override
        void display() {
            System.out.println("this is child");
        }
    }

    public static void main(String[] args) {

        child obj = new child();
        parent.child c = new parent.child();
        
        obj.display(); // if child dont override display this parent will be printed
        c.display();
        
    }
}