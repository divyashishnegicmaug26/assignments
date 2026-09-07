#include<iostream>
using namespace std;
#include<string>
class ledgerentry{
    string description;
    double* amounts;
    int days;
    public:
    static int totalEntries ;
    ledgerentry(const string& desc, int days): description(desc),days(days),amounts(new double[days]){
        totalEntries++;
    }
    ledgerentry(const ledgerentry& other){
        description = other.description;
        days = other.days;
        amounts = new double[days];
        for(int i = 0;i<days;i++){
            amounts[i] = other.amounts[i]; 
        }
        totalEntries ++;
    }

      ledgerentry(ledgerentry&& other) noexcept {
    description = other.description;
    days = other.days;

    amounts = other.amounts;
    totalEntries++;

    other.amounts = nullptr;

    }

    ledgerentry& operator=(const ledgerentry& other){
        if(this != &other){
            delete [] amounts;
            description = other.description;
            days = other.days;
            amounts = new double[days];
            for(int i = 0; i <days;i++){
                amounts[i]=other.amounts[i];
            }}
        return *this;}

        ledgerentry& operator=(ledgerentry&& other) noexcept{
                if(this!=&other){
                    delete[] amounts;
                  description = other.description;
                     days = other.days;

                amounts = other.amounts;

                    other.amounts = nullptr;
    
            }return *this;
        }

        ledgerentry operator+(const ledgerentry& other) const{
            ledgerentry result(description + other.description, other.days);
            for(int i = 0 ;i<result.days;i++){
                result.amounts[i] = amounts[i]+ other.amounts[i];
            } return result;
        }

            bool operator==(const ledgerentry& other) const{
                int sum = 0 ;
                int sum1 = 0;
                for(int i = 0 ;i<days;i++){
                    sum+=amounts[i];
                    sum1+=other.amounts[i];
                }
                if(sum==sum1){
                    return true;}
                    else{
                        return false;
                    }
                }
                

            bool operator>(const ledgerentry& other) const{
                double sum = 0;
                double sum1 = 0;
                for(int i = 0 ;i<days;i++){
                    sum+=amounts[i];
                    sum1+=other.amounts[i];
                }
                return sum >sum1;}

                    double& operator[](int index){
                        return amounts[index];
                    }// called by ledger()

                    const double& operator[](int index) const{
                        return amounts[index];
                    } // called by const ledger()

                    friend ostream& operator<<(ostream& out, const ledgerentry& entry){
                        out<< "description : "<<entry.description << "days : " << entry.days;
                        out<<"amount :"<<endl;
                        for(int i = 0 ; i <entry.days ; i++){
                            out<<entry.amounts[i];
                        }
                        return out;



                    }
                    friend istream& operator>>(istream& in, ledgerentry& entry){
                        in>>entry.description >> entry.days;
                        
                        for(int i = 0 ; i <entry.days ; i++){
                            in>>entry.amounts[i];
                        }
                        return in;

                    }

        

        
~ledgerentry(){
    delete[] amounts;
    totalEntries--;
}

};
int ledgerentry:: totalEntries=0;

int main(){
   
 // Objective 1 — Constructor & deep copy
 ledgerentry jan("January Sales", 5);
 jan[0] = 1200.50; jan[1] = 3400.00; jan[2] = 800.75;
 jan[3] = 2100.00; jan[4] = 650.25;
 ledgerentry feb("February Sales", 5);
 feb[0] = 900.00; feb[1] = 2200.50; feb[2] = 1750.00;
 feb[3] = 3000.00; feb[4] = 475.50;
 cout << jan << endl;
 cout << feb << endl;
 // Objective 2 — Operator + (sum two ledgers into combined)
 ledgerentry combined = jan + feb;
 cout << "Combined: " << combined << endl;
 // Objective 3 — Relational operators
 cout << "Jan == Feb : " << (jan == feb ? "Yes" : "No") << endl;
 cout << "Jan > Feb : " << (jan > feb ? "Yes" : "No") << endl;
 // Objective 4 — Move constructor (should NOT deep copy)
 ledgerentry moved = move(jan);

 cout << "After move, jan.amounts is null: "
 << (/* check jan is empty */ true ? "YES" : "NO") << endl;
 cout << "Moved entry: " << moved <<endl;
 ledgerentry q1("Q1 Total", 5);
 q1 = move(feb); // feb's resources transferred to q1
 cout << "Q1 (moved from feb): " << q1 << endl;
 // Objective 6 — Static member
 cout << "Live LedgerEntry objects: " << ledgerentry::totalEntries << endl;
 return 0;
}



