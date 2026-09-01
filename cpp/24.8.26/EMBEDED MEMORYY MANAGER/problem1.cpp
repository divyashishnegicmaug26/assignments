#include <iostream>
using namespace std;
void swapnormal(int a,int  b){
    int temp = a;
    a=b;
    b = temp;
}

void swappingwithref(int &a,int &b){
    int temp = a;
    a=b;
    b = temp;
}
void swappingwithptr(int *q,int *p){
    int temp = *q;
     *q = *p;
     *p = temp;
}
int main(){
    int  a= 10;
    int b = 20; 
    cout<<"before swap : " << a <<" "<< b<<endl;
    swapnormal(a,b);
    cout<<"normal swap : "<< a <<" " << b <<endl;
    cout<<"before swapping with ref : "<< a<< " " << b<<endl;
    swappingwithref(a,b);
    cout<<"swapping with ref : "<< a<< " " << b<<endl;

    cout<<"before swapping with ptr : "<< a <<" " << b <<endl;
    swappingwithptr(&a,&b);
    cout<<"swapping with ptr : "<< a <<" " << b <<endl;
}