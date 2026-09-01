#include<iostream>
#include<cstdlib>
using namespace std;
enum class legend{
    grass, water,mountain, forest, dungeon
};

int main(){
  //
  int  r= 3;
  int c = 4;
    int **arr;
    arr= new int *[r];
    for(int i = 0 ; i <r;i++){
        arr[i] = new int[c];
    }
    for(int i = 0 ; i<r;i++){
        for(int j = 0;j<c;j++){
            arr[i][j]= rand()%5;
        }
    }
    for(int i = 0 ; i<r;i++){
        for(int j = 0;j<c;j++){
            cout<<arr[i][j]<<" ";
        }cout<<endl;
    }
    
    int grass=0, water=0,mountain=0, forest=0, dungeon=0;
    for(int i = 0 ; i<r;i++){
        for(int j = 0;j<c;j++){
          if (arr[i][j]==static_cast<int>(legend::grass)){
            grass++;}
            if(arr[i][j]==static_cast<int>(legend::water)){
                water++;
            }
            if(arr[i][j]==static_cast<int>(legend::mountain)){
                mountain++;
            }
            if(arr[i][j]==static_cast<int>(legend::forest)){
                forest++;
            }if(arr[i][j]==static_cast<int>(legend::dungeon)){
            dungeon++;
            }
          }
        }

        cout<<"grass : "<< grass<<endl;
        cout<<"water : "<< water<<endl;
        cout<<"mountain : "<< mountain<<endl;
        cout<<"forest : "<< forest<<endl;
        cout<<"dungeon : "<< dungeon<<endl;

        for (int i =0 ; i <r ; i ++){
            delete[] arr[i];
        }
        delete[] arr;

    }


