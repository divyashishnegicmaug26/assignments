#include <iostream>
#include <cmath>
using namespace std;

inline double distancebetween(double x1,double y1,double x2, double y2){
return sqrt(pow(x2-x1,2)+pow(y2-y1,2));
}

inline double toRadians(double degrees){
    return degrees *(M_PI / 180.0);
}

inline double clamp(double value , double minval, double maxval){
  if(value<=minval){
    return minval;
  }else if (value>= maxval){
    return maxval;
  }
  return value;
    }

    inline bool safezone(double x, double y, double cx, double cy, double radius){
        //(x - cx) * (x - cx) + (y - cy) * (y - cy) <= r * r
        if(pow((x-cx),2)*pow((y-cy),2) <=radius *radius){
            return  true;
        }else{
            return false;
        }
    }



int main(){
    cout<<"enter value for x1 ";
    double x1;
    cin>> x1;
    cout<<"enter value for y1 ";
    double y1;
    cin>> y1;
    cout<<"enter value for x2 ";
    double x2;
    cin>> x2;
    cout<<"enter value for y2 ";
    double y2;
    cin>> y2;
    cout<< "distance between the two point is"<< distancebetween(x1,y1,x2,y2)<<endl;
    cout<<"enter degree for radians ";
    double degree;
    cin>>degree;
    cout<<"radians is"<< toRadians(degree)<<endl;
    double cx = 0.0;
    double cy = 0.0;
    cout<<"enter value to find safe zone"<<endl;
    double x3;
    cout<<"enter value for x axis";
    cin >> x3;
    double y3;
    cout<<"enter value for y axis"<<endl;
    cin >> y3;
    double radius = 50.0; 
    cout<<"issafezone"<<safezone(x3,y3,cx,cy,radius)<<endl;
    double value,minval,maxval;
    cout<<"enter value"<<endl;
    cin>>value;
    cout<<"enter minval"<<endl;
    cin>>minval;
    cout<<"enter maxval"<<endl;
    cin>>maxval;
    cout<< "clamp"<< clamp(value,minval,maxval)<<endl;

}