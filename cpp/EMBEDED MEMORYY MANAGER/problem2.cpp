#include<iostream>
#include<climits>
using namespace std;
double squaresum(double *p,int n){
    double sum = 0 ;
    for(int i = 0 ; i<n;i++){
        sum += *(p+i) * *(p+i);
    }
    sum = sum/n;
    return sum;
}


void diff(double *p , int n){
    int max = INT_MIN;
 for(int i = 0 ; i<n;i++){
    if(max<*(p+i)){
        max = *(p+i);
    }}
    if(max <0){
        max = -1*max;
    }
    for(int i  = 0 ; i <n ;i++){
       *(p+i) =(*(p+i)) / max;
    }

 
}


int countzero(double*p,int n){
    int positive = 0;
    for(int i = 0 ;i <n-1 ; i =i+2){
        if(*(p+i)< 0 && *(p+i+1)> 0 || *(p+i)> 0 && *(p+i+1)< 0){
            positive++;
        } 
        }
        return positive;
    } 


void gainfact(double *p , int n , double gain){
    for (int i = 0 ; i <n ; i ++){
        *(p+i)= *(p+i)*gain;
    }
}   




int main(){
   double arr[4] = {-1, 2, -3, 4};
   double arr1[4]{-1, 2, -3, 4};
    double gain = 2.0;
    int n = 4;

   

    cout << "Count zero: " << countzero(arr, 4) << endl;
    cout << "Square sum: " << squaresum(arr, 4) << endl;

    cout<<"before normalise: "<<endl;
    for(int i = 0; i <n ; i ++){
        cout<< arr[i]<< " ";
    }cout<<endl;

    cout<<"after normalise : "<<endl;
    diff(arr,4);
    for(int i = 0; i <n ; i ++){
        cout<< arr[i]<< " ";
    }cout<<endl;

    cout<<"before countZeroCrossings : "<<endl;
    for(int i = 0; i <n ; i ++){
        cout<< arr1[i]<<" ";
    }cout<<endl;
    cout<<"after countZeroCrossings: "<<endl;
    gainfact(arr1,4,gain);
     for(int i = 0; i <n ; i ++){
        cout<< arr1[i]<<" ";
    }cout<<endl;
   
    return 0;
}