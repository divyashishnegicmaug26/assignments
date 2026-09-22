package collect;
import java.util.Scanner;
//Interfaces
//1. Start by making a normal Java-7-style application
//with these features: 
//* An interface called RegularPolygon with two 
//abstract methods: getNumSides and getSideLength
// • A class EquilateralTriangle that implements 
// the interface, has getNumSides return 3 and
//		 getSideLength return an instance variable 
//				 that is set by the constructor. 
//* A class Square that implements the interface, 
//has getNumSides return 4 and getSideLength 
//		return an instance variable that is set by the constructor.
//
//2. Add a static totalSides method, that given a RegularPolygon[],
//returns the sum of the number of sides of all the elements. 
//
//3. Add two default methods:
//• getPerimeter (n * length, where n is the number of sides) 
//• getInteriorAngle ( (n-2)π/n in radians)



public class eq{
	 static int totalside (RegularPolygon[] arr) {
		 int t=0;
		 
		 for(RegularPolygon a:arr) {
			 if(a instanceof Square a1) {
			 if(a1!=null) {
				 t += a1.getNumSides();
		 }} if(a instanceof EquilateralTriangle a1) {
			 if(a1!=null) {
				 t += a1.getNumSides();
		 }
	 }}
		 return t;
	 }
	
	public static void main(String[]args) {
		RegularPolygon[] arr= new RegularPolygon[10];
		System.out.println("WElcome");
		Scanner sc = new Scanner(System.in);
		int i=0;
		outer:
		for(;;) {
			System.out.println("1)Add");
			System.out.println("2)total sides");
			System.out.println("3) perameter and angle");
			System.out.println("3) Exit");
			int c=sc.nextInt();
			switch(c) {
			case 1:
			System.out.println("1)square");
			System.out.println("2)EquilateralTriangle");
			System.out.println("2)Exit");
			int c1=sc.nextInt();
			switch(c) {
			case 1:
				System.out.println("enter size");
				int size= sc.nextInt();
				for(int j=0;j<size;j++) {
					System.out.println("enter sides");
					int side=sc.nextInt();
					arr[j]=new Square(side);
				}
				break;
			case 2:
				System.out.println("enter size");
				int size1= sc.nextInt();
				for(int j=0;j<size1;j++) {
					int side=sc.nextInt();
					arr[j]=new Square(side);
				}break;
			case 3: continue outer;
			}
			case 2:
				System.out.println(totalside(arr));
				break;
			case 3:
				for(RegularPolygon a: arr) {
				if(a instanceof Square a1) {
					System.out.println("square");
					System.out.println(" angle :"+" "+a1.getangle()+""+"pera : "+a1.getperamter());
				}else if(a instanceof EquilateralTriangle a1) {
					System.out.println("EquilateralTriangle");
					System.out.println(" angle :"+" "+a1.getangle()+""+"pera : "+a1.getperamter());
					}
				}break;
			case 4:
				return;}
	i++;}
}
}
