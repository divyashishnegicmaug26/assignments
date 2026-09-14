package assignment4;

public class engineer extends employee {
	int overtime;

	engineer(String name
			,String address
			,int age
			,char gender
			,int salary, int overtime){
		super(name,address,age,gender,salary);
	this.overtime = overtime;
	}
	@Override
	void display() {
		System.out.println("name" + name+"	"+"salary" + salary+"	"+"address" + address+"	"+"gender" + gender+"	"+"age" +age+"	"+"overtime" +"	"+overtime);
	}
	}

