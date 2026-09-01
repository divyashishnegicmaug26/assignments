#include<iostream>
#include <cstdlib>
using namespace std;
int main(int argc, char* argv[]){
    int warn_threshold;
    int critical_threshold;
    int num_readings;
    if(argc<4){
        cout<< "error";
        return 1;
    }
    warn_threshold =stoi(argv[1]);
    critical_threshold =stoi(argv[2]);
    num_readings =stoi(argv[3]);
    if(warn_threshold >= critical_threshold){
        cout<< "error: critical threshold must be smaller warn threshold";
        return 1;
    }
    if(num_readings>100 ||num_readings<1){
        cout<<"error: num_readings must be between 1 to 100";
        return 1;
    }
    int normal =0;
    int warning =0;
    int critical=0;
    int shutdown =0;
    for(int i = 0; i <num_readings ; i++){
        if(29>=rand()%70){
            normal++;;
        }else if (44>=rand()%70){
            warning++;
        }else if (59>=rand()%70){
            critical++;
        }else if (60<=rand()%70){
            shutdown++;
        }
        
    }

    cout<< "Normal: " << normal<<endl;
    cout<< "Warning: " << warning<<endl;
    cout<< "Critical: " << critical<<endl;
    cout<< "Shutdown: " << shutdown<<endl;

    return 0;


    
}