package assignment3;

public class rectangle {
	int length;
	int breadth;
	rectangle(int l,int b){
		length=l;
		breadth=b;
	}
int area() {
	return length*breadth;
}
int perameter() {
	return 2*(length+breadth);
	
}
}
class square extends rectangle{
	int side;
	square(int side, int l, int b){
		super(l,b);
		this.side =side;
	}
	int area() {
		return (side*side);
	}
	int perameter() {
		return(4*side);
	}
}
class main{
public static void main(String[] args) {
	
	rectangle a = new rectangle(4,6);
	square b = new square(4,6,3);
	System.out.println("rectangle area : "+ a.area());
	System.out.println("rectangle perameter : "+a.perameter());
	System.out.println("square paramter : "+b.area());
	System.out.println("square parameter : "+b.perameter());
}
}