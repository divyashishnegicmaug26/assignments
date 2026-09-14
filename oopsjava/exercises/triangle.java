package soriting.java;
import java.util.Scanner;
public class triangle {
	private double side1;
	private double  side2;
	private double side3;


	triangle(double side1,double side2,double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	double perameter() {
		return (side1+side2+side3);
	}
	double area() {
		double s = (side1+side2+side3)/2;
		double area = Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));
		return area;
	}
	public static void maine(String[]args) {
		Scanner s = new Scanner(System.in);
		int side1,side2,side3;
		System.out.println("enter number1");
		side1=s.nextInt();
		System.out.println("enter number2");
		side2=s.nextInt();
		System.out.println("enter number3");
		side3=s.nextInt();
		triangle sc = new triangle(side1,side2,side3);
		System.out.println("parameter is: "+ sc.perameter()+" area is  :"+ sc.area());

	}

}
//The Employee Assignment
//
//Create a menu based console application for holding the data of the Employees in an Organisation.  The details of the Employee entered by the user from the console will be stored in a doubly linked list which can be then traversed by the user by choosing the appropriate menu selection.  Each sub menu of the section will loop until the Exit to Main Menu option is not selected.
//
//1. Add an Employee
//	a. Manager
//	b. Engineer
//	c. Sales Person
//	d. Exit to Main Menu
//2. Display
//	a. All Employees
//	b. First Employee
//	c. Next Employee
//	d. Previous Employee
//	e. Last Employee
//	f. Exit to Main Menu
//3. Sort
//	a. All Managers
//	b. All Engineers
//	c. All Sales Person
//	d. All Employees Alphabetic order ascending
//	e. All Employees Alphabetic order descending
//	f. Exit to Main Menu
//4. Save to File
//5. Load from File
//6. Exit
