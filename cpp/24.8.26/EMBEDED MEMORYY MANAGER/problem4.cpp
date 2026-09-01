 #include <iostream>
 using namespace std;
 bool parsePacket(const int* rawdata, int size,
 const int** outmin,const int** outmax){ //  A normal pointer cannot point to a const variable, but a normal varible can hold the value of const variable
   if (size <0){
    return false;
   }else{
    *outmin = rawdata;
    *outmax = rawdata;
    for(int i = 0;i <size;i++){
      
            if(**outmin>*(rawdata+i)){
                *outmin = (rawdata+i);

            }
            if(**outmax<*(rawdata+i)){
                *outmax = (rawdata+i);
         
        }
    }
    return true;
   }
 }
// If size <= 0 : return false, leave output pointers unchanged
// Otherwise : set *outMin to point at the minimum element in rawData
// set *outMax to point at the maximum element in rawData
// return true


int main(){int packet[] = {45, 12, 67, 8, 55, 31};
const int* minPtr = nullptr;
const int* maxPtr = nullptr;// here did it const  because it rawdata is constptr  meaning if maxptr or minptr point to array they can change the value of array which the const  rawdata pointer dont want  
if (parsePacket(packet, 6, &minPtr, &maxPtr)) {
 cout << "Calibration Min : " << *minPtr << endl;
 cout << "Calibration Max : " << *maxPtr << endl;
}


}