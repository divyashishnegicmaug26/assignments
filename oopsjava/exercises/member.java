package assignment3;
// inhertied non static classes
class member {

    String name;
    int age;
    int ph_no;
    String address;
    int salary;

    member(String name, int age, int phone, String address, int salary) {

        this.name = name;
        this.age = age;
        ph_no = phone;
        this.address = address;
        this.salary = salary;
    }

    void printsalary() {
        System.out.println(salary);
    }

    void getter() {
        System.out.println(name + "\t" + ph_no + "\t" + age + "\t" + salary + "\t" + address);
    }

}  


class primemembers extends member {

    int joiningyears;
    int joiningfees;
    boolean isactive;

    primemembers(int year, int fees, boolean active,
                 String name, int age, int phone,
                 String address, int salary) {

        super(name, age, phone, address, salary);

        joiningyears = year;
        joiningfees = fees;
        isactive = active;
    }

    void getter() {
        System.out.println(name + "\t" + ph_no + "\t" + age + "\t" + salary + "\t" + address +"\t"+joiningyears + "\t" + joiningfees + "\t" + isactive);
    }

} 


class test{
    public static void main(String[] args) {

        member m = new member(
            "Ashu",
            22,
            987654321,
            "Dehradun",
            50000
        );

        primemembers p = new primemembers(
            2024,
            1000,
            true,
            "Rahul",
            25,
            987654321,
            "Delhi",
            60000
        );

        m.getter();
        m.printsalary();

        System.out.println();
        
        p.getter();
        p.printsalary();
    }
}
