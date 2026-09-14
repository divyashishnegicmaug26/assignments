package soriting.java;

 public class student {
	private String name;
	private int roll_no;
	private String phone_no;
	private String address;
	{
		roll_no = 2;
		name = "john";
		address = "mumbai";
		phone_no="839165082";
	}
	student(){}
	void setrollandname(String name, int roll_no) {
		this.name = name;
		this.roll_no = roll_no;
	}
	void setaddressandphone(String address, String phone) {
		this.address = address;
		this.phone_no = phone;
	}
	void getter1() {
		System.out.println(address+" "+phone_no+" "+name+" "+roll_no);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s = new student();
		s.setaddressandphone("bihar", "8495185451");
		student s1 = new student();
		s1.setrollandname("same", 34);
	System.out.println();
		s1.getter1();
		s.getter1();
	}

}
