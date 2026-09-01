#include <iostream>
using namespace std;
int main(){
    double c;
    cout<<"enter temprature in celcius";
    cin>>c;
    int f = (c * 9 / 5) + 32;
    cout<<"temperature "<<c<<"c / "<<f<<"f"<<endl;

    int statscode;

    if(c<0){
        statscode = -1;
    }else if(c<=29){
        statscode = 0;
    }
    else if(c<=44){
        statscode = 1;
    }else if(c<=59){
        statscode = 2;
    }else if(c<=60){
        statscode = 3;
    }
    cout<< "statscode : "<< statscode << endl;

   switch(statscode){
    case -1:
    cout<< "status: SENSOR_ERROR " <<endl;
    cout<<"ACTION: Sensor fault — check wiring"<<endl;
   break;

   case 0:
   cout<< "status: NORMAL " <<endl;
   cout<<"ACTION: No action required"<<endl;
   break;

   case 1:
   cout<< "status: WARNING  " <<endl;
   cout<<"ACTION: Alert sent to supervisor"<<endl;
   break;

   case 2:
   cout<< "status: CRITICAL  " <<endl;
   cout<<"ACTION: Cooling system triggered"<<endl;
   break;

   case 3:
   cout<< "status: SHUTDOWN  " <<endl;
   cout<<"ACTION: Emergency shutdown initiated"<<endl;
   break;
    }

    c>=25?cout<<" Above Average"<<endl:cout<<"Below Average"<<endl;
}