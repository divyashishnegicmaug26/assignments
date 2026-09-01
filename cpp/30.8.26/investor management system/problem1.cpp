#include<iostream>
using namespace std;
class product {
   static int productId;
    string name;
    double price;
    int quantity;

    public:
    product(){
        productId++;
    }
    void acceptDetails(){
        cout<<"enter product detail"<<endl;
        cout<<"enter product id"<<endl;
        int n;
        cin>>n;
        this->productId = n;
        cout<<"enter product name"<<endl;
        
        string name;
        cin>>name;
        this->name = name;
        cout<<"enter product price"<<endl;
        
        double price;
        cin>>price;
        this->price = price;
        cout<<"enter product quantity"<<endl;
        
        int quantity;
        cin>>quantity;
        this->quantity = quantity;


    }double totalValue()const {
        return price*quantity;
    }

    void displayDetails() const{
        
        cout<<productId<<"        " <<name<<"    " << price<<"       " << quantity<<"          " << totalValue()<<"    "<<endl; 
        
    }
    
    bool isLowStack(int threshold) const {
        //quantity = 10 not possivle because of const
        if(quantity<threshold){
            return true;
        }else{
            return false;
        }
    }
};
int product::productId = 0;
int main(){
    
    product arr[2];
    for(int i = 0 ; i <2 ; i++){
        arr[i].acceptDetails();
    }
    cout<<" ID   "<< "   Name   "<< "qty    "<<"    price   "<< "   totalvalue   "<<endl;
    for(int i = 0 ;i<2;i++) {
        arr[i].displayDetails(); 
    }
    int high = arr[0].totalValue();
    for(int i = 0 ;i<2;i++) {
        if(high<arr[i].totalValue()){
            high = arr[i].totalValue();
        } 
    }
    cout<<"Highest Value Product :"<< high<<endl;

    int threshold;
    cout<<"enter threhold";
    cin>>threshold;

    cout<<"Low Stock (threshold:"<< threshold<<")"<<endl;
    for(int i = 0 ; i <2;i++){
        if(arr[i].isLowStack(threshold)){
            
             arr[i].displayDetails();
        }

    }





}