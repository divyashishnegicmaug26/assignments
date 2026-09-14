package assignment3;

public class shapes {
	void display() {
		System.out.println("this is shape");
	}

}
 class circle extends shapes {
	void display() {
		System.out.println("this is circle");
	}}
 
class rect extends shapes {
	void display() {
			super.display();
		System.out.println("this is rectangle");
		}}
class squ extends rect {
			void display() {
				super.display();;
				System.out.println("square is rectangle");
			}
				
			}
class main1{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			squ a = new squ();
			a.display();
		}		
}