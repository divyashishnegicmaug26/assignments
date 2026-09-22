package com.assignment7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.*;
public class mainfortx {

	public static void main(String[] args) {
		transcation[] t1=new transcation[5];
		int i=0;
		while(i<5) {
			 Scanner sc = new Scanner(System.in);

		        System.out.print("Enter transaction id: ");
		        int txId = sc.nextInt();

		        System.out.print("Enter transaction amount: ");
		        float txAmount = sc.nextFloat();

		        System.out.print("Enter arrears status (true/false): ");
		        boolean txArears = sc.nextBoolean();

		        System.out.print("Enter transaction status (true/false): ");
		        boolean txStatus = sc.nextBoolean();
			t1[i]=new transcation(txId,LocalDate.now(),txAmount,txArears,txStatus)
			i++;
		}
		List<transcation>l1=new ArrayList<>(Arrays.asList(t1));
		
		Predicate<transcation> f1=(x)->x.txAmount>5000;
		List<transcation>l2=new ArrayList<>();
		for(int j = 0;j<l1.size();j++) {
			if(f1.test(l1.get(j))){
				l2.add(l1.get(j));
			}
			
		}
		System.out.println(l2);

	}

}
