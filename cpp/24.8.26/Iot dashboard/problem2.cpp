#include <iostream>
#include <climits>
using namespace std;

int main(){
    int n ;
    do {
        cout << "Enter number of elements (2-100): ";
        cin >> n;
    } while (n < 2 || n > 100);

    int arr[n];
    cout << "Enter " << n << " temperature values:" << endl;
    for(int i = 0 ;i<n;i++){
        cin>>arr[i];
    }

    int idx=0;
    int cnt=0;
    for(int i = 0 ;i<n;i++){
        if(arr[i]<0){
            cnt++;
            continue;
        }
        cout<<arr[i]<<endl;
        if(arr[i]>45){
            idx = i;
            break;
        }
    }
    cout<<"Skipped (errors): "<<cnt<<endl;
    cout<< "Index of first temp > 45: "<< idx<<endl;

    int min = INT_MAX;
    int max = INT_MIN;
    int sum = 0;
    for(int i = 0 ;i <n;i++){
        if(arr[i]>max){
            max = arr[i];
        }
        if(arr[i]<min){
            min = arr[i];
        }
        sum +=arr[i];
    }
    double average = static_cast<double>(sum)/n;
    cout<<"Min: "<< min <<" Max: "<< max << " Avg: "<< average <<endl;

    int normal=0;
    int warning = 0;
    int critical = 0;
    int shutdown = 0;

    for(int i = 0;i<n;i++){
        if(arr[i]<=29){
            normal++;
        }
        else if(arr[i]<=44){
            warning++;
        }else if(arr[i]<=59){
            critical++;
        }else if(arr[i]<=60){
            shutdown++;
        }
    }
    cout<<"Normal: " <<normal<<endl;
    cout<<"WARNING: " <<warning<<endl;
    cout<<"CRITICAL: " <<critical<<endl;
    cout<<"SHUTDOWN: " <<shutdown<<endl;

    return 0;
}
    