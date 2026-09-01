#include <iostream>
using namespace std;

class employee {

    int empId = 1000;
    string name;
    string department;
    char grade;
    double basicsalary;
    bool isactive = true;
    static int employeecount;

public:

    employee() {
        employeecount++;
        empId = 1000 + employeecount;
    }

    void setName(const string& n) {
        this->name = n;
    }

    void setDepartment(const string& dept) {
        this->department = dept;
    }

    void setGrade(char g) {
        this->grade = g;
    }

    void setBasicSalary(double salary) {
        this->basicsalary = salary;
    }

    void deactivate() {
        isactive = false;
    }

    int getEmpId() const {
        return empId;
    }

    string getName() const {
        return name;
    }

    string getDepartment() const {
        return department;
    }

    char getGrade() const {
        return grade;
    }

    double getBasicSalary() const {
        return basicsalary;
    }

    bool getIsActive() const {
        return isactive;
    }

    double computeAllowances() const {
        if (grade == 'A') {
            return 0.4 * basicsalary;
        }
        else if (grade == 'B') {
            return 0.3 * basicsalary;
        }
        else if (grade == 'C') {
            return 0.2 * basicsalary;
        }
        else if (grade == 'D') {
            return 0.1 * basicsalary;
        }

        return 0.0;
    }

    double computeGrossSalary() const {
        return basicsalary + computeAllowances();
    }

    double computeTax() const {
        if (computeGrossSalary() <= 50000) {
            return 0.0;
        }
        else if (computeGrossSalary() <= 100000) {
            return 0.1 * (computeGrossSalary() - 50000);
        }
        else {
            return 5000 + 0.2 * (computeGrossSalary() - 100000);
        }
    }

    double computeNetSalary() const {
        return computeGrossSalary() - computeTax();
    }

    void printPayslip() const {

        cout << "============================================" << endl;
        cout << "EMPLOYEE PAYSLIP — AUG 2026" << endl;
        cout << "============================================" << endl;

        cout << "Emp ID : " << empId << endl;
        cout << "Name : " << name << endl;
        cout << "Department : " << department << endl;
        cout << "Grade : " << grade << endl;
        cout << "Status : " << (isactive ? "Active" : "Inactive") << endl;

        cout << "--------------------------------------------" << endl;

        cout << "Basic Salary : " << basicsalary << endl;
        cout << "Allowances : " << computeAllowances() << endl;
        cout << "Gross Salary : " << computeGrossSalary() << endl;
        cout << "Tax : " << computeTax() << endl;

        cout << "--------------------------------------------" << endl;

        cout << "Tax Deduction : " << computeTax() << endl;
        cout << "Net Salary : " << computeNetSalary() << endl;

        cout << "============================================" << endl;
    }

    static int getEmployeeCount() {
        return employeecount;
    }

   void acceptdetails() {

    string n;
    string dept;
    char g;
    double salary;

    cout << "Enter a name: ";
    cin >> n;
    setName(n);


    do {
        cout << "Enter department: ";
        cin >> dept;

    } while (dept != "engineering" &&
             dept != "HR" &&
             dept != "finance" &&
             dept != "operation");

    setDepartment(dept);


    do {
        cout << "Enter grade: ";
        cin >> g;

    } while (g != 'A' &&
             g != 'B' &&
             g != 'C' &&
             g != 'D');

    setGrade(g);


    do {
        cout << "Enter salary: ";
        cin >> salary;

    } while (salary < 10000 || salary > 500000);

    setBasicSalary(salary);
}
};

int employee::employeecount = 0;// declarlation if done inside main that is assignment 
 

int main() {
// assignment of employcount employee:: employeecount
    // Create objects — one on stack, two on heap
    employee e1;

    employee* e2 = new employee();

    employee* e3 = new employee();


    e1.acceptdetails();
    e2->acceptdetails();
    e3->acceptdetails();


    // Try uncommenting — observe the compiler error, then explain in a comment
    // e1.empId = 999;
    // e1.basicsalary = -1000;


    e1.printPayslip();
    e2->printPayslip();
    e3->printPayslip();


    // Simulate a resignation
    e3->deactivate();

    if (!e3->getIsActive())
        cout << e3->getName()
             << " is no longer active. Payroll skipped." << endl;


    cout << "Total Employees : "
         << employee::getEmployeeCount() << endl;


    delete e2;
    delete e3;

    return 0;
}