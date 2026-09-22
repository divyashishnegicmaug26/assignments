package collect;
import java.util.ArrayList;
import java.util.Iterator;
//1. Write a Java program to create a new array list, 
//  add some colors (string) and print out the collection.
//2. Modify the above Java program to insert an 
//  element into the array list at the first position.
//3. Modify the above Java program to retrieve
//  an element (at a specified index) from a given array list.
//4. Modify the above Java program to update 
//  specific array element by given element.
//5. Modify the above Java program to remove 
//   the third element from a array list.
//6. Modify the above Java program to search an element in a array list
public class one {

	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<>();
		String[]c = {"pink","read","nlue"};
		
		
		for(String d:c) {
			a.add(d);
		}
	a.addFirst("orange");
	System.out.println(a);
	String g= a.get(0);
	System.out.println(g);
	a.set(3, "pink");
	System.out.println(a);
	a.remove(2);
	System.out.println(a);
	
	for(int i=0;i<a.size();i++) {
		if(a.get(i)=="pink") {
			System.out.println(i);
		}
		
		
		
	}
	
	
	}
	

}
