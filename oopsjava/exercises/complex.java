package soriting.java;
import java.util.Scanner;
public class complex {
private int imag;
private int comp;

complex(int a,int b){
	imag = a;
	comp = b;
}
complex add(complex a) {
	int c = comp+a.comp;
	int i = imag+a.imag;
	return new complex(c, i);
}
complex multiple(complex a ) {
	int c = (a.comp*comp)-(a.imag*imag);
	int b = (a.comp*imag)+(a.imag*comp);
	return new complex(c,b);

}
void display() {
	System.out.println(comp+"+" +imag+"i");


}
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	complex x= new complex(a,b);
	int temp = sc.nextInt();
	int temp1 = sc.nextInt();
	complex y= new complex(temp,temp1);
	complex z = x.multiple(y);
	complex o = x.add(y);
	z.display();
	o.display();

}
}
