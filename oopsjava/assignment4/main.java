package assignment4;
import java.util.Scanner;
public class main {
	static Scanner sc = new Scanner(System.in);
	
	static manager[] asort(manager a[],int size) {
		if(a==null) {
			System.out.println("empty array hai re baba");}
			else {
				for(int i = size-1;i>0;i--) {
					boolean check = true;
					for(int j = 0;j<i;j++) {
						int c = a[j].name.compareTo(a[j+1].name);
					if(c>0) {
						manager temp = a[j];
						a[j] =a[j+1];
						a[j+1]=temp;
						check=false;
						}
					
					}
					if(check == true) {
						break;
					}
				}
				
		}
		
		return a;
	}
	static manager[] dsort(manager a[],int size) {
		if(a==null) {
			System.out.println("empty array hai re baba");}
			else {
				for(int i = size-1;i>0;i--) {
					boolean check = true;
					for(int j = 0;j<i;j++) {
						int c = a[j].name.compareTo(a[j+1].name);
					if(c<0) {
						manager temp = a[j+1];
						a[j+1] =a[j];
						a[j]=temp;
						check=false;
						}
					
					}
					if(check == true) {
						break;
					}
				}
				
		}
		
		return a;
	}
	
	static engineer[] asort(engineer a[],int size) {
		if(a==null) {
			System.out.println("empty array hai re baba");}
			else {
				for(int i = size-1;i>0;i--) {
					boolean check = true;
					for(int j = 0;j<i;j++) {
						int c = a[j].name.compareTo(a[j+1].name);
					if(c>0) {
						engineer temp = a[j];
						a[j] =a[j+1];
						a[j+1]=temp;
						check=false;
						}
					
					}
					if(check == true) {
						break;
					}
				}
				
		}
		
		return a;
	}
	static engineer[] dsort(engineer a[],int size) {
		if(a==null) {
			System.out.println("empty array hai re baba");}
			else {
				for(int i = size-1;i>0;i--) {
					boolean check = true;
					for(int j = 0;j<i;j++) {
						int c = a[j].name.compareTo(a[j+1].name);
					if(c<0) {
						engineer temp = a[j+1];
						a[j+1] =a[j];
						a[j]=temp;
						check=false;
						}
					
					}
					if(check == true) {
						break;
					}
				}
				
		}
		
		return a;
	}
	static salesperson[] asort(salesperson a[],int size) {
		if(a==null) {
			System.out.println("empty array hai re baba");}
			else {
				for(int i = size-1;i>0;i--) {
					boolean check = true;
					for(int j = 0;j<i;j++) {
						int c = a[j].name.compareTo(a[j+1].name);
					if(c>0) {
						salesperson temp = a[j];
						a[j] =a[j+1];
						a[j+1]=temp;
						check=false;
						}
					
					}
					if(check == true) {
						break;
					}
				}
				
		}
		
		return a;
	}
	
	static salesperson[] dsort(salesperson a[],int size) {
		if(a==null) {
			System.out.println("empty array hai re baba");}
			else {
				for(int i = size-1;i>0;i--) {
					boolean check = true;
					for(int j = 0;j<i;j++) {
						int c = a[j].name.compareTo(a[j+1].name);
					if(c<0) {
						salesperson temp = a[j+1];
						a[j+1] =a[j];
						a[j]=temp;
						check=false;
						}
					
					}
					if(check == true) {
						break;
					}
				}
				
		}
		
		return a;
	}
static void manager(manager a[],int size) {
System.out.println("enter number of manager want to input");

	
	for(int i=0;i<size;i++) {
		System.out.println("Enter name : ");
		String name =sc.next();
		System.out.println("Enter address : ");
		String address=sc.next();
		System.out.println("Enter age : ");
		int age=sc.nextInt();
		System.out.println("Enter gender: ");
		char gender=sc.next().charAt(0);
		System.out.println("Enter salary : ");
		int salary=sc.nextInt();
		a[i]=new manager(name,address,age,gender,salary);
	}
}
static void engineer(engineer a[],int size) {
System.out.println("enter number of engineer want to input");


	for(int i=0;i<size;i++) {
		System.out.println("Enter name : ");
		String name =sc.next();
		System.out.println("Enter address : ");
		String address=sc.next();
		System.out.println("Enter age : ");
		int age=sc.nextInt();
		System.out.println("Enter gender: ");
		char gender=sc.next().charAt(0);
		System.out.println("Enter salary : ");
		int salary=sc.nextInt();
		System.out.println("Enter overtime : ");
		int overtime=sc.nextInt();
		a[i]=new manager(name,address,age,gender,salary,overtime);
	}
}
static void salesperson(salesperson a[],int size) {
System.out.println("enter number of salesperson want to input");

	
	for(int i=0;i<size;i++) {
		System.out.println("Enter name : ");
		String name =sc.next();
		System.out.println("Enter address : ");
		String address=sc.next();
		System.out.println("Enter age : ");
		int age=sc.nextInt();
		System.out.println("Enter gender: ");
		char gender=sc.next().charAt(0);
		System.out.println("Enter salary : ");
		int salary=sc.nextInt();
		System.out.println("Enter overtime : ");
		int overtime=sc.nextInt();
		a[i]=new salesperson(name,address,age,gender,salary,overtime);
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mangsize=0;
		int engisize=0;
		int salesize =0;
		manager mag[] =null;
		engineer engi[]=null;
		salesperson sale[]=null;
		int b=0;
		outer:
		while(true){
			System.out.println("select number");
			System.out.println("(1) ADD");
			System.out.println("(2) DISPLAY");
			System.out.println("(3) SORT");
			System.out.println("(4) EXIT");
			b = sc.nextInt();
			switch(b){
			case 1:
			
				while(true) {
				System.out.println("select number");
				System.out.println("(1) MANAGER");
				System.out.println("(2) ENGINEER");
				System.out.println("(3) SALESPERSON");
				System.out.println("(4) Exit");
				int c = sc.nextInt();
				switch(c) {
				case 1: 
					System.out.println("enter size");
					mangsize=sc.nextInt();
						mag = new manager[mangsize];
						System.out.println("emter engineer details");
					System.out.println("manager");
					manager(mag,mangsize);
					break;
				case 2:		System.out.println("enter size");
				engisize=sc.nextInt();
				engi = new manager[engisize];
					System.out.println("emter engineer details");
					engineer(engi,engisize);
					break;
				case 3:
					System.out.println("enter size");
					salesize = sc.nextInt();
					sale = new salesperson[salesize];
					System.out.println("salesperson details");
					salesperson(sale,salesize);
					break;
				case 4 :continue outer;}
			}
			case 2:	
				while(true) {
				System.out.println("select number");
				System.out.println("(1) MANAGER");
				System.out.println("(2) ENGINEER");
				System.out.println("(3) SALESPERSON");
				System.out.println("(4) Exit");
				int d = sc.nextInt();
				switch(d) {
				case 1: 
					for(int i =0;i<mangsize;i++) {
						mag[i].display();
					}
				
					break;
				case 2:		
					for(int i =0;i<engisize;i++) {
						engi[i].display();
					}
					
					break;
				case 3:
					for(int i =0;i<salesize;i++) {
						sale[i].display();
					}
					break;
				case 4 :
					continue outer;}}
				
				
			case 3:
				inner:
				while(true) {
				System.out.println("select number");
				System.out.println("(1) MANAGER");
				System.out.println("(2) ENGINEER");
				System.out.println("(3) SALESPERSON");
				System.out.println("(4) Exit");
				int e = sc.nextInt();  
				switch(e) {
				case 1: while(true) {
					System.out.println("(1) ACCENDING");
					System.out.println("(1) DECCENDNG");
					int g = sc.nextInt();
					switch(g) {
					case 1: 
						mag = asort(mag,mangsize);
						continue inner;
					
				
					case 2:		
						mag = dsort(mag,mangsize);
						continue inner;
					}}
				case 2: while(true) {
					System.out.println("(1) ACCENDING");
					System.out.println("(2) DECCENDNG");
					int g = sc.nextInt();
					
					switch(g) {
					case 1: 
						engi = asort(engi,engisize);
						continue inner;
						
					
			
					case 2:		
						engi = dsort(engi,engisize);
						continue inner;
						
					}}
				
				case 3: while(true) {
					System.out.println("(1) ACCENDING");
					System.out.println("(2) DECCENDNG");
					int g = sc.nextInt();
					
					
					switch(g) {
					case 1: 
						sale = asort(sale,salesize);
						continue inner;
					
					
					case 2:		
						sale = dsort(sale,salesize);
						continue inner;
					}}
				case 4:
					continue outer;
				}
				}
			case 4 :
				return;
			
			}
		}
}
}


