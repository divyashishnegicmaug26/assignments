#include<iostream>
#include<memory>
using namespace std;
class texture{
    public:
    string name;
     int width;
      int height;
      texture(){
        cout<<"[Texture Loaded]"<<endl;
      }
      void display()const{
        cout<<"width is : "<< width<< " " << "height is " << height<<endl;
    }
      ~texture(){
        cout<<"[Texture Released]"<<endl;
      }
    
};
int main(){
    unique_ptr<texture> a = make_unique<texture>();
    a->name = "player_sprite";
    a->height = 512;
    a->width=512;
    a->display();
    //unique_ptr<texture>b = make_unique<texture>(b); will give compilation error unique means only one so it can only have one pt pointing to it.
     unique_ptr<texture> b = move(a);
     cout<<"------------------------------- b is now -------------------------------------"<<endl;

    b->display();// ek baar texture released hoga kyuki a nullptr ko point kr rha hai uske pass destory krne ke liye kuch hai he nhi 

    if(a==nullptr){// dont use *a kyuki nullptr koi value nhi hai, ye bs batata hai ki ye pointer kisi ko point nhi kr rha. hai 
        cout<<"a  is null"<<endl;
    }


}