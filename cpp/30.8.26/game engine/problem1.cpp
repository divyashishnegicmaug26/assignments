#include<iostream>
using namespace std;
int level = 1 ;
namespace Physics {
    double clamp(double val, double min, double max){
        if(val<min){
            return min;
        }else if(val>max){
            return max;
        }else{
            return val;
        // clamp a velocity
    }}
    double lerp(double a, double b, double t){
     return a+(b-a)*t;
 // linear interpolation for
}

}
namespace GameMath {
 int clamp(int val, int min, int max){
     if(val<min){
        return min;
    }else if(val>max){
        return max;
    }else{
        return val;
        // clamp an integer stat
    }
 } 

 double lerp(double a, double b, double t){
     return a+(b-a)*t;
    }
}


class entity{
    string name ;
    int health;
    int level;
    string type;
    public:
    entity& setname(const string& name){
        this->name = name;
        return *this;
    }
    entity& sethealth(int  health){
        this->health = health;
        return *this;
    }
    entity& setlevel(int level){
        this->level = level;
        return *this;
    }
    
    entity& settype(const string& type) {
        if(type=="Player"||type=="Enemy"||type=="Item"){
            this->type= type;
        }else{
           cout<<"enter from player enemy or item";
           string n;
           do{
            cin>>n;
           }while(n!="player"&&n!="enemy"&&n!="item");
           this->type = n;
        }return *this;
        

    }string getName() const{
        return name;
    }
int getHealth() const{
    return health;
};
int getLevel() const{
    return level;
}
string getType() const{
    return type;
}
void displayInfo() const{
    cout<<"player name : "<< name << " | player health  : "<<health <<" | player level : "<< level<< " | player type : "<< type <<endl;
}

};

    
namespace engine{
    namespace audio{
       void  playSound(string name){
        cout<<"Playing : " <<  name<<endl ;
    }
}
}


int main(){
    int level = 1 ;
    
entity player;
entity  enemy;
entity  item;
player.setname("Aragorn").sethealth(100).setlevel(10).settype("player");
enemy.setname("Orc").sethealth(60).setlevel(5).settype("Enemy");
item.setname("HealthPotion").sethealth(0).setlevel(1).settype("Item");

player.displayInfo();
enemy.displayInfo();
item.displayInfo();
{
using namespace Physics;
double cl = clamp(static_cast<double>(item.getHealth()),0,100);
double le = lerp(static_cast<double>(item.getLevel()),100,.5);
cout<< "physics clamp is : "<< cl<<endl;
cout<< "physics lerp is : "<< le<<endl;

}
double mc = GameMath::clamp(item.getHealth(),0,100);
double l = GameMath::lerp(static_cast<double>(item.getLevel()),100,.5);

cout<< "maths clamp is : "<< mc<<endl;
cout<< "mmaths  lerp is : "<< l<<endl;
cout<<"global level : "<< level<<endl;
cout<<"main level : "<< level<<endl;

engine::audio::playSound(player.getName());

}
