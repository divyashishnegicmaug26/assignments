#include<iostream>
using namespace std;
#include<memory>

class logbuffer{
    char *buffer;
    int capacity;
    int size;
    static int instancecount;
    public:
logbuffer(int capacity){
        buffer = new char[capacity];
        buffer[0] = '\0';
        this->capacity= capacity;
        instancecount++;
        cout<< "[LogBuffer Created] capacity = ";
        
        
    }
logbuffer(const logbuffer& other){
    int i = 0 ;
    size = other.size;
    capacity = other.capacity;
    buffer = new char[capacity];
    while(other.buffer[i]!='\0'){
        this->buffer[i]=other.buffer[i];
        i++;
        instancecount++;
        
    }
    buffer[i]='\0';

    cout<< "[copy Created] capacity = " ;
      
    }
logbuffer& operator=(const logbuffer&other){
    if( this != &other ){
        delete[]  buffer;
    capacity = other.capacity;
    size = other.size;
    buffer = new char[capacity];
int i =0;
     while(other.buffer[i]!='\0'){
        this->buffer[i]=other.buffer[i];
        i++;
        
    }
    
    buffer[i]='\0';
    cout<< "[derived assignment Created] capacity = " ;
    return *this;}
    }
        void  append(const char* msg ){
            int j =0;
            while (buffer[j]!='\0'){
                j++;
            }
            int i = 0;
            while(msg[i] != '\0'&&j<capacity-1){
                buffer[j]=msg[i];
                i++;
                j++;
            }
            buffer[j]='\0';

        }
        
        void print() const{
            cout<<this->capacity<<endl;
             int i = 0 ;
             while(buffer[i]!='\0'){
                cout<<buffer[i];
                i++;
            }cout<<endl;
            
        }
        void clear(){
            instancecount = 0;
        }
        static int getInstanceCount(){
            return logbuffer::instancecount;
        }

    
    ~logbuffer(){
    delete[] buffer;
    }
};
    int logbuffer::instancecount = 0 ;

    int main() {

logbuffer log1(256);
 log1.append("Server started on port 8080");
 log1.append(" | Request received from 192.168.1.10");
 log1.print();
    logbuffer log2 = log1; // copy constructor
 log2.append(" | Cached response sent");
 cout << "log1 : ";
  log1.print() ; // must NOT contain log2's append
 cout << "log2 : ";
  log2.print() ;

//  Objective 3 : Copy assignment operator
    logbuffer log3(128);/
    log3 = log1; // copy assignment  
    log3.print();

//    Objective 4 : Self-assignment guard
log1 = log1; // must not crash or corrupt data
log1.print();
    // Objective 5 : Static member
 cout << "Livelogbuffer objects : " <<logbuffer::getInstanceCount() << endl;


}