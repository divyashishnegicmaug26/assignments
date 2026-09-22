package day21;
import java.util.function.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
//Using existing (pre-defined) Functional Interfaces in Java write,
//
//1. Lambda expression to sort a string array in alphabetical order
//2. Lambda expression to find the largest number in an integer array.
//3. Lambda expression to find the smallest number in an integer array.
//4. Lambda expression to generate a 3 digit random number
//5. Lambda expression that takes an integer array and returns the reverse integer array
//6. Lambda expression to print the current date
//7. Lambda expression to evaluate if a number entered is a Prime number
//8. Lambda expression to accept 2 strings and return the concatenated value of the same

//Exercise 2
//Create a Lamda for generating a random OTP which will be formed of 5 chars, the 1st Char should be a vowel followed by 4 random numbers generated from 0-9. eg
//A8391, U8665 and so on



//Create the following using Lambda and Collection Framework
//
//Create a class called Transaction that contains the following data members
//1. txId int
//2. txDate LocalDate
//3. txAmount float
//4. txStatus boolean
//5. txArrears boolean
//
//Create 5 objects of the above Transaction object by taking input from the user and store the same in a Collection object.
//
//
//Create the Lambda expressions for
//1. Getting all the Transactions from the Collection where the txAmount is > 5000
//
//2. Getting all the Transactions where the txStatus is false
//
//3. Write a Lambda Function to generate the amount due. The amount due is calculated as the txAmount + Rs. 500/- + 18% of txAmount if the txArrears is true else if txArrears if false then only the txAmount will be returned


public class first {
	public static void main(String[]args) {
		String arr[]= {"yellow","read","apple","pink","banana"};
		ArrayList<String> a=new ArrayList<>(Arrays.asList(arr));
		System.out.println(a);
//		a.sort((first,last)->
////			((first.compareTo(last)>0)?1:(last.compareTo(first)>0)?-1:0)
////		);
//		first.compareTo(last));
//		System.out.println("arraylist:"+a);
		
		Arrays.sort(arr,(first,second)->
			first.compareTo(second));
				for(String a1:arr) {
		System.out.println("array:"+a1);}
		
		
//		BiPredicate<String,String> a1=(first,Second)->
//		(first.compareTo(Second)>0);
//		
//		System.out.println(a1.test("negi", "negi"));
		//========================================================================================
		Integer[]a2= {1,6,5,8,4,10};
		Predicate<Integer> b1= x->x==20;
		boolean ch=false;
		for(Integer a3:a2) {
			if(b1.test(a3)) {
				ch=true;
			}
		}System.out.println("found "+ ch);
		//==========================================================================
		BiPredicate<Integer,Integer> p1=(x,y)->x>y;
		int x1= Integer.MAX_VALUE;
		for(Integer i = 0 ;i<a2.length;i++) {
			if(p1.test(x1, a2[i])){
				x1=a2[i];
			}
		}
		System.out.println("smallest is"+ x1);
		
	//==============================================================================
		Supplier<Double> c1=()->Math.random();
		double s1=c1.get();
		Function<Double,Integer> c2=(s)->(int)((s*100)+100);
		
		System.out.println(c2.apply(c1.get()));
		
	//===============================================================================
		Arrays.sort(a2,(first,second)->
		second.compareTo(first));
		for(Integer a3 : a2) {
			System.out.println("reversed sorted array"+a3);
			
		}
//====================================================================================
		Supplier<LocalDate> ld=()->LocalDate.now();
		System.out.println(ld.get());
		
//==============================================================================
		BiPredicate<Integer,Integer> p3=(x,y)-> {
			boolean flag=false;
		if(x%y!=0) {
			flag= true;
			
		}else{
			flag=false;
		
		}
		return flag;
	};
	
	boolean flag=false;
	Integer n=5;
	for(Integer i= 2;i<n;i++) {
		if(p3.test(n,i)){
			flag=true;
			
		}else {
			flag=false;
			break;
		}
	}
	System.out.println(flag);
//===============================================================================	
	BiFunction<String,String,String> s2=(x,y)->x+" "+y;
	 System.out.println(s2.apply("nah", "this assignment is crap"));
//===============================================================================
	 Supplier s3=()->
	 {String c[]= {"A","E","I","O","U"};
	 String b = c[(int)(Math.random()*c.length)];
	 int c3= (int)(Math.random()*9000)+1000;
	 return b+c3;
	 };
	 System.out.println(s3.get());
	
	 
	}
	}