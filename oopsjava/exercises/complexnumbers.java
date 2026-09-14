package soriting.java;
import java.util.Scanner;
public class complexnumbers {
	int num1;
	int num2;
	complexnumbers(int a , int b){
		num1=a;
		num2=b;
	}
	complexnumbers(){

	}
complexnumbers multiply(complexnumbers a) {
	int c = (a.num1*num1)-(a.num2*num2);
	int b = (a.num2*num1)+(a.num1*num2);
	return new complexnumbers(c,b);
}

	void setter(int a,int b) {
		num1=a;
		num2=b;
	}
	String getter() {
	 return num1+"+"+num2+"i";
	}
public static void main(String[]args) {
	System.out.println("enter numbers");
	Scanner sc = new Scanner(System.in);
	int a= 0;
	int b = 0 ;
	complexnumbers[] c = new complexnumbers[5];
	for(int i = 0;i<5;i++) {
		a=sc.nextInt();
		b=sc.nextInt();
		c[i]=new complexnumbers();
		c[i].setter(a,b);
		}
	for(int i = 0; i < 5; i++) {
		System.out.println(c[i].getter());


	}
}
}
