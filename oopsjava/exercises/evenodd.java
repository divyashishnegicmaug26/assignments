package soriting.java;

public class evenodd {

	public static void main(String[] args) {
		int []arr = new int[1000];
		for(int i =1;i<1000;i++) {
			arr[i]=i;
			if(arr[i]%2!=0) {
				System.out.println("odd"+" "+i);
			}else if((arr[i]%2==0)&&(i<=500)) {
				System.out.println("even"+" "+i);
			}
		}
		//using for loops write a Java Program to display every 7th
		//number from 1 to 200
		int[]newarr=new int[200];
		for(int i =1;i<200;i++) {
			newarr[i]=i;
			if(newarr[i]%7==0) {
				System.out.println(newarr[i]);
			}
//
//
		}

	}

}
