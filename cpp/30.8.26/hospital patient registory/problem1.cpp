#include<iostream>
using namespace std;
class patient{
int patientId;
string name;
int age;
string ward;
const string bloodGroup;
public:

patient() :patientId(0), name("Unknown"), age(0),ward("General"), bloodGroup("O+"){

    cout<<"constructor by default values"<<endl;
  
 }
 patient(int id, const string& name,string bloodGroup ="unknown"): bloodGroup(bloodGroup){
    this ->patientId = id;
    this ->name = name;
    cout<<"2 parameter constructor"<<endl;
 }
 patient(int id, const string& name, int age, const string& ward, const string&
bloodgroup) : bloodGroup(bloodgroup) {
    this ->patientId=id;
    this ->name = name;
    this ->age = age;
    this ->ward = ward;
    cout<<"constructor by values"<<endl;
  
}
void displayRecord() const{
    cout<< "patientid  " << patientId << " |  name : " <<name<<" |  age : "<<age<<" |  ward : "<<ward<<" | bloodgroup : "<< bloodGroup<<endl;
}
~patient(){
    cout<< "Patient "<< this->name <<" discharged."<<endl;
}
void transferWard(const string& newWard){
    this->ward = newWard;
}
};

int main(){
    cout<<"enter name and id for emergency  "<<endl;
    cout<<"enter id"<<endl;
    int i; 
    cin>>i;
    cout<<"enter name"<<endl;
    string n;
    cin>>n;
    patient b(i,n);
    patient a;
    patient c(101,"ashu",40,"emergency","A+");

    patient *arr= new patient[3];

    for(int i = 0 ; i<3;i++){
        arr[i].displayRecord();
        
    }
    cout<<"changing last person ward from arr to emergency ward ...."<<endl;
    for(int i = 0 ; i<3;i++){
        if(i==2){
        arr[2].transferWard("emergency");
        arr[2].displayRecord();
        }
    }
    
    delete []arr;





}