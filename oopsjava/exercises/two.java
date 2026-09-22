package collect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.PrimitiveIterator;
import java.util.Collections;
import java.util.TreeSet;
//7. Modify the above Java program to sort a given array list.(Hint : Use the class Collections)
//8. Modify the above Java program to copy one array list into another. (Hint : Use the class Collections)
//9. Modify the above Java program to shuffle elements in a array list. (Hint : Use the class Collections)
//10. Modify the above Java program to reverse elements in a array list. (Hint : Use the class Collections)
//11. Write a Java program to create a new tree set, add some colors (string) and print out the tree set. 
//12. Modify the above Java program to add all the elements of a specified tree set to another tree set.  
//13. Modify the above Java program to create a reverse order view of the elements contained in a given tree set.
//14. Modify the above Java program to get the first and last elements in a tree set.  
//15. Write a Java program to get the element in a tree set which is greater than or equal
//to the given element. (Hint : Use the ceiling method of the TreeSet)
public class two {

	public static void main(String[] args) {
		
		int []a={10,59,24,6,32,25,76,25,26,756};
		ArrayList<Integer> c= new ArrayList<>();
		for(int x:a) {
			c.add(x);
		}
//		Iterator<Integer> x = c.iterator();
		ArrayList<Integer>f= new ArrayList<>(Collections.nCopies(c.size(),0));
//		while(x.hasNext()) {
//			Integer f1= x.next();
//			f.add(f1);
//			}
		Collections.copy(f, c);
		System.out.println(f);
		f.sort(null);
		System.out.println(f);
		Collections.shuffle(f);
		System.out.println(f);
		Collections.reverse(f);
		System.out.println();
		NavigableSet<String> q1=new TreeSet<>();
		String[] a1= {"pink","red","orange"};
		for(String a2:a1){
			q1.add(a2);
		}
		TreeSet<String> w1=new TreeSet<>();
		w1.addAll(q1);
		System.out.println(q1);
		System.out.println(w1.reversed());
		
//		System.out.println(w1);
//		System.out.println(q1.getFirst());
//		System.out.println(q1.getLast());
		
			System.out.println(q1.ceiling("blue"));
			
	
	}

}
