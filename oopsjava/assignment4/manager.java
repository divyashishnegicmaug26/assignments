package assignment4;

public class manager extends employee {
int hra= salary*20/100;

manager(String name
		,String address
		,int age
		,char gender
		,int salary
		){
	super(name,address,age,gender,salary);
}
@Override
void display() {
	System.out.println("name" + name+"salary" + salary+"address" + address+"gender" + gender+"age" +age+"hra" + hra);
}
}
