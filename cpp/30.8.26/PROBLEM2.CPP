#include<iostream>
using namespace std;
class product {
    string name;
    double price;
    int quantity;
    
    public:
  

void acceptDetails(){
    cout<<"enter product detail"<<endl;
    
    string name;
    do{
        cout<<"enter product name"<<endl;
        cin>>name;
    }while(name.empty());
        this->name = name;
        cout<<"enter product price"<<endl;
        
        double price;
        cin>>price;
        this->price = price;
        cout<<"enter product quantity"<<endl;
        
        int quantity;
        cin>>quantity;
        this->quantity = quantity;
}
    double p(){
        return this->price;
    }
    int q(){
        return this->quantity;
    }
};   
    double reorderCost(int qty,double unitPrice){
        return static_cast<int>(qty*unitPrice);
    }
    double reorderCost(double qty,double unitPrice){
        return (qty*unitPrice);
    }
    double reorderCost(int qty,double unitPrice,double taxRate){
        double cost =(qty *unitPrice);
        double tax = cost * taxRate /100;
        double final = cost+tax;
        return final;
    }
    double applyDiscount(double price,double discountPercent = 10.0){
        return price-(price*discountPercent)/100;
    }

    int main(){
     product p ; 
     p.acceptDetails();
     double tax;
     cout<<"enter tax"<<endl;
     cin>>tax;
     
     
     int a = reorderCost(static_cast<double>(p.q()),p.p());
     
        double  b= reorderCost(p.q(),p.p());
        double t = reorderCost(p.q(),p.p(),tax);
        cout<<"reodercost in Integer : " <<a<<endl;
        cout<<"reodercost in double : " <<b<<endl;
        cout<<"reordercost with tax  : " <<t<<endl;
        cin.ignore();
        string dis;
        cout<<"enter dis% : "<<endl;
        getline(cin,dis);
        double discount;
        if(dis.empty()){
            discount = applyDiscount(p.p());
            
        }else{
             discount = applyDiscount(p.p(),stod(dis));

        }
        
        cout<<"after discount : " <<discount<<endl;
        
    }
    
