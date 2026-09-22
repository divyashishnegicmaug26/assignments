package assignment4;

public abstract class employee {
 public String name;
 String address;
 int age;
char gender;
int salary;

employee(String name
,String address
,int age
,char gender
,int salary
){
	this.name= name;
	 this.address=address;
	 this.age=age;
	 this.gender=gender;
	 this.salary=salary;

}
 abstract void display();


}
