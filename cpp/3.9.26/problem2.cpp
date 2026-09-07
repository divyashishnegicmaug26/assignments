#include <iostream>
#include <string>
#include<vector>
#include<iomanip>
#include<algorithm>
#include<iterator>

using namespace std;

class Vehicle {
protected:
    string registrationNo;
    string ownerName;
    int yearOfManufacture;
    double kmDriven;

public:
    Vehicle(const string& reg, const string& owner, int year, double km)
        : registrationNo(reg), ownerName(owner),
          yearOfManufacture(year), kmDriven(km) {
            // cout<<"constructor created";
          }

    virtual double fuelCost(double kmToTravel) const = 0;

    virtual void describe() const {
        cout<<setw(2)<< registrationNo<<" " <<ownerName<<" " <<yearOfManufacture<<" " << endl;
    }

    virtual string vehicleType() const = 0;

    virtual ~Vehicle() {
        cout << "Vehicle Destructor" << endl;
    }

    double getKmDriven() const {
        return kmDriven;
    }

    string getRegNo() const {
        return registrationNo;
    }
};


    class Car : public Vehicle {
    string fuelType;
    double mileageKmpl;

public:
    Car(const string& reg,
        const string& owner,
        int year,
        double km,
        const string& fuel,
        double mileage)
        : Vehicle(reg, owner, year, km),
          mileageKmpl(mileage) {
            if(fuel == "Petrol" || fuel == "Diesal"){
                this->fuelType=fuel;
          }else{
            cout<<"not a valid fuel";
            //  cout<<"car created";
          }}

    double fuelCost(double kmToTravel) const override{
        double fuelPrice=0.0;

        if (fuelType == "Petrol")
            fuelPrice = 106.00;
        else
            fuelPrice = 93.00;

        return (kmToTravel / mileageKmpl) * fuelPrice;
    }

    string vehicleType() const override {
        return "Car";
    }

    // void describe() const override {
    //     Vehicle::describe();

    //     cout << "Fuel Type: " << fuelType << endl;
    //     cout << "Mileage: " << mileageKmpl << " kmpl" << endl;
    // }

    ~Car() override {
        cout << "Car Destructor" << endl;
    }
};

    class truck: public Vehicle{
        double payloadCapacityTons;
        double fuelEfficiencyKmpl;
        public:
        truck(string registrationNo,string ownerName,int yearOfManufacture, double kmDriven,double  payloadCapacityTons,double fuelEfficiencyKmpl ):Vehicle(registrationNo,ownerName,yearOfManufacture, kmDriven),fuelEfficiencyKmpl(fuelEfficiencyKmpl),payloadCapacityTons(payloadCapacityTons){
            //  cout<<"truck created";
        }
        virtual double fuelCost(double kmToTravel) const{
            double d =fuelEfficiencyKmpl-((payloadCapacityTons*5)/100);
             double b = (kmToTravel / d) * 93.00;
            return b;}
    
        string vehicleType()const {
            return "truck";
        }
        
    ~truck() override {
        cout << "truck Destructor" << endl;
    }};
    

    class electrictruck:public truck{
        double batteryCapacityKWh;
         double rangePerChargeKm;
    public:

    electrictruck( string registrationNo,string ownerName, int yearOfManufacture, double kmDriven, double payloadCapacityTons1,double fuelEfficiencyKmp2,double  rangePerChargeKm,double  batteryCapacityKWh):truck(registrationNo,ownerName,yearOfManufacture,kmDriven,payloadCapacityTons1,fuelEfficiencyKmp2),rangePerChargeKm(rangePerChargeKm),batteryCapacityKWh(batteryCapacityKWh){
        //  cout<<"electric created";
    }
         double fuelCost(double kmToTravel) const{
            return ( kmToTravel/ rangePerChargeKm)* batteryCapacityKWh *9.50;
        } 
        string vehicleType()const override{
            return "electrictruck";
        }
        
    ~electrictruck() override {
        // cout << "electrictruck Destructor" << endl;
    }};

    class van:public Vehicle{
         int seatingCapacity;
          double mileageKmpl;
          public:
          van(  double kmDriven,int yearOfManufacture,string ownerName,string registrationNo,int seatingCapacity,double mileageKmpl):mileageKmpl(mileageKmpl), seatingCapacity( seatingCapacity),Vehicle(registrationNo,ownerName,yearOfManufacture,kmDriven){
             cout<<"van created";
          }
          double fuelCost(double kmToTravel) const{
            return 106.00*(kmToTravel/mileageKmpl); }
            string vehicleType() const{
                return"van";}
            
            ~van() override {
        cout << "van Destructor" << endl;}
    };

    void printFleetReport(const vector<Vehicle*>& fleet, double tripKm){
        for(int i = 0;i<fleet.size();i++){
            fleet[i]->describe();
            cout<<fleet[i]->fuelCost(tripKm)<<endl;
        }

        double min = fleet[0]->fuelCost(tripKm);
        cout<<min<<endl;
        for(int i = 0;i<fleet.size();i++){
            if(min>fleet[i]->fuelCost(tripKm)){
                min=fleet[i]->fuelCost(tripKm);
            }           
         }
         cout<<"min cost is : "<< min<<endl;

         electrictruck *a= dynamic_cast< electrictruck*>(fleet[3]); 

         
            
            
    }

  int main() 

    {
    //     electrictruck et(
    //         "V-ET001",
    //         "Green Logistics",
    //         2024,
    //         50000,
    //         10,
    //         8,
    //         300,
    //         100
    //     );

    //     cout << "...scope ends..." << endl;
    // }

    // return 0;
vector<Vehicle*> s;

s.emplace_back(new Car(
    "KA01AA001",
    "Ramesh Kumar",
    2026,
    45200,
    "Petrol",
    46.86118479
));

s.emplace_back(new truck(
    "MH04BB002",
    "Truck Shyam Logistics",
    2026,
    123500,
    10,
    19.174
));

s.emplace_back(new electrictruck(
    "GJ07CC003",
    "Electric Truck Green Fleet Co",
    2026,
    89000,
    10,
    20,
    200,
    16.3158
));
printFleetReport(s,500);

}