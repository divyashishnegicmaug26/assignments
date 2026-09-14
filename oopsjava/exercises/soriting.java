package soriting.java;
import java.util.Scanner;
public class soriting {
	 int size;
	 int arr[];

	void sorting() {
		int check = 0;
		for(int itemp= size-1; itemp>=0;itemp--) {
			for(int jtemp= 0; jtemp<itemp;jtemp++) {
				if(arr[jtemp]>arr[jtemp+1]) {
					swapping(jtemp,jtemp+1);
//					check=1;
//				}
//				if(check==0) {
//					break;
//				}
			}

		}
	}}
	private void swapping(int a,int b) {
		int temp= arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	soriting(int arr[],int size){
		this.size = size;
		this.arr = new int[size];
		for(int i=0;i<size;i++) {
			this.arr[i]=arr[i];
		}

	}
	int getter(int i ){
			return this.arr[i];

	}
	int sum() {
		int sum = 0 ;
		for(int i=0;i<size;i++) {
			sum+=arr[i];
		}
		return sum;

	}
	int average() {
		int sum = sum();
		int average = sum/size;
		return average;
	}
	void copy(soriting b) {
		size = b.size;
		for(int i=0;i<size;i++) {
			arr[i]=b.arr[i];
		}

	}
	int max() {
		int max = arr[0];
		for(int i=1;i<size;i++) {
			if(max<=arr[i]){
				max = arr[i];
		}
		}return max;

	}
	int min() {
		int min = arr[0];
		for(int i=1;i<size;i++) {
			if(min>=arr[i]){
				min = arr[i];
		}
		}return min;

	}

	void reverse() {
		int i =0;
		int j = size-1;
		while(i<j) {
			swapping(i,j);
			i++;
			j--;
		}
	}
	int arrsize(soriting a) {
		int b = 0 ;
		if(size>a.size) {
			b=a.size;
		}else {
			b= size;
		}
		return b;
	}
	int[] duplicates() {
			int [] result = new int[size];
			int c = 0;
			for (int i = 0; i < size; i++) {
				boolean present=false;

			        for (int j = 0; j <c; j++) {
			            if (result[j] == arr[i]) {
			               present = true;
			               break;
			            }}
			            if(present) {
			            	continue;
			            }
			            for (int k = i+1; k <size; k++) {
	    				if (arr[k] == arr[i]) {
	    				result[c]=arr[k];
	    				c++;
	    				break;
	    				}
			        }
			    }
			int [] finalresult = new int[c];

			 for (int k = 0; k <c; k++) {

				        finalresult[k] = result[k];

				    }

			return finalresult;

		}

	int[] arrdulpicate(soriting a) {
		int [] result = new int[arrsize(a)];
		int c = 0;
		for (int i = 0; i < a.size; i++) {
			boolean present=false;

		        for (int j = 0; j <c; j++) {
		            if (result[j] == a.arr[i]) {
		               present = true;
		               break;
		            }}
		            if(present) {
		            	continue;
		            }
					 for (int k = 0; k <size; k++) {
    				if (arr[k] == a.arr[i]) {
    				result[c]=a.arr[k];
    				c++;
    				break;
    				}
		        }
		    }
		int [] finalresult = new int[c];

		 for (int k = 0; k <c; k++) {

			        finalresult[k] = result[k];

			    }

		return finalresult;

	}

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter size of arr");
			int size = sc.nextInt();
			System.out.println("enter size of arr");
			int[] arr= new int[size];
			for(int i = 0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			soriting obj = new soriting(arr,size);
			obj.sorting();
			for(int i = 0 ; i<size;i++) {
				System.out.println(obj.getter(i));
			}



	}

}
