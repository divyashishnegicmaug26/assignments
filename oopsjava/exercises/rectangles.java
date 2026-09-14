package soriting.java;

public class rectangles {
	private int length;
	private int breadth;
	rectangles(int a,int b){
		length = a;
		breadth = b;
	}
	int area() {
		return (length*breadth);
	}
	void display() {
		System.out.println("area : " + length + " "+ "breadth : " + breadth +  "area : "+area());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangles s = new rectangles(3,4);
		rectangles s1 = new rectangles(5,8);
		s.display();
		s1.display();


	}

}
