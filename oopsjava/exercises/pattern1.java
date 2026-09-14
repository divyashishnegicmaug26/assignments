package soriting.java;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		*
//		**
//		***
//		****
//		*****
		for(int i = 0 ;i<=5;i++) {
			for(int j =0;j<i;j++) {
				System.out.print("*");
			}System.out.println();
		}
//		*****
//		****
//		***
//		**
//		*
		System.out.println();
		for(int i = 0 ;i<=5;i++) {
			for(int j =5;j>i;j--) {
				System.out.print("*");
			}System.out.println();
		}
//		1
//		2 3
//		4 5 6
//		7 8 9 10
	System.out.println();
	int a =1;
	for(int i = 0 ;i<=4;i++) {
		for(int j =0;j<i;j++) {
			System.out.print(a+" ");
			a++;
		}System.out.println();
	}
//	1
//	1 2
//	1 2 3
//	1 2 3 4
//	1 2 3 4 5
//	1 2 3 4 5 6
	System.out.println();

	for(int i = 0 ;i<=6;i++) {
		int b = 1;
		for(int j =0;j<i;j++) {
			System.out.print(b+" ");
			b++;

		}System.out.println();
	}
//	1 2 3 4 5 6
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1
	System.out.println();
	for(int i = 6 ;i>=0;i--) {
		int d =1;
		for(int j =0;j<i;j++) {
			System.out.print(d+" ");
			d++;
		}System.out.println();
	}
}}
