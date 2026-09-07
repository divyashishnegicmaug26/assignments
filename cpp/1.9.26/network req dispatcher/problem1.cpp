#include<iostream>
using namespace std;
enum class HttpStatus {
 OK = 200,
 Created = 201,
 BadRequest = 400,
 Unauthorized = 401,
 NotFound = 404,
 ServerError = 500
};

void handleResponse(HttpStatus status, const string& endpoint){
     int x =static_cast<int>(status);
     switch(x){
        case 200:
           cout<<"[GET /api/users]"<<" →"<<" 200 OK :" <<endpoint<<endl;
           break;
         case 401:           
           cout<<"[POST /api/login]"<<" →"<<" 401 OK :"<< endpoint<<endl;
           break;
         case 404:   
         cout<<"[GET /api/products/99]"<<" →"<<" 404 Not Found  :"<<endpoint<<endl;
         break;
         case 500:
           cout<<"[POST /api/order]"<<" →"<<" 500 Server Error :  "<< endpoint <<endl;
           break;
        }
    };

int main() {
            HttpStatus a = HttpStatus:: OK;
            HttpStatus b = HttpStatus::Unauthorized;
            HttpStatus c = HttpStatus:: NotFound;
            HttpStatus d = HttpStatus::ServerError;
            
            
            
            

            ::handleResponse(a,"Request successful");
            ::handleResponse(b,"Authentication required");
            ::handleResponse(c,"Endpoint does not exist");
            ::handleResponse(d,"Internal server error — retry later");
        }
      






