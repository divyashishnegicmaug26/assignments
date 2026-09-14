package soriting.java;

public class employee {
	String name;
	int year;
	String address;
	int hours;
	int salary;
employee(String name,int year,String address) {
	this.name = name;
	this.year = year;
	this.address = address;
}
void getinfo(int hours,int salary) {
	this.salary = salary;
	this.hours=hours;
}
void addsal() {
	if(salary<500) {
		salary+=10;
	}

}
void addwork() {
	if(hours>6) {
		salary+=5;
	}
}
void display() {

	System.out.println(name+"	"+year+"	"+address+"	"+hours +"	"+salary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			employee s = new employee("ashu",2026,"64c_wallsstreet");
			employee s1 = new employee("viash",2026,"64c_wallsstreet");
			employee s2 = new employee("aswes",2026,"64c_wallsstreet");
		System.out.println("name"+"	"+"year"+"	"+"address"+"		"+"hours"+"	"+"salary");
		s.display();
		s1.display();
		s2.display();
		s1.getinfo(10,300);
		s1.addsal();
		s1.addwork();
		s1.display();
	}


}
