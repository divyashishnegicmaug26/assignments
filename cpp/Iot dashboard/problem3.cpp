#include<iostream>
#include<climits>
using namespace std;
int main(){
    const int FLOORS = 3;
    const int ROOMS = 3;
    int rooms[FLOORS][ROOMS]{{15,53,67},{67,77,34},{65,72,90}};
    int hotest = INT_MIN;
    int floor = -1;
    int room = -1;
    int cnt = 0;
    cout<<"       room 1   room 2   room 3 "<<endl;
    for(int i = 0 ; i < FLOORS ; i ++){
        cout<<"FLOORS"<<i<<" ";

    for(int j = 0 ; j < ROOMS ; j ++){
        cout<<rooms[i][j]<<"       ";
    }cout<<endl;

    }
    for(int i = 0; i < FLOORS; i++){
        for(int j = 0; j < ROOMS; j++){
            if(rooms[i][j] >= hotest){
                hotest = rooms[i][j];
                floor = i;
                room = j;
            }
            if(rooms[i][j] >= 30){
                cnt++;
            }
        }
    }

    int row = -1;
    double hotestfloor = -1e9;

    for(int i = 0; i < FLOORS; i++){
        int sum = 0;
        for(int j = 0; j < ROOMS; j++){
            sum += rooms[i][j];
        }
        double avg = static_cast<double>(sum) / ROOMS;
        if(avg > hotestfloor){
            hotestfloor = avg;
            row = i;
        }
    }

   
    cout << "Hottest temperature: " << hotest << " (Floor " << floor << ", Room " << room << ")" << endl;
    cout << "Number of rooms more than  30 : " << cnt << endl;
    cout << "Floor with highest average temperature:r " << row << " (Average: " << hotestfloor << ")" << endl;

    return 0;
}