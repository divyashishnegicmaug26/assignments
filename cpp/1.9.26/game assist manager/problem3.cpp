#include<iostream>
using namespace std;
#include<memory>
class audioclip{
    string name;
    double volume;
    public:
    audioclip(string name , double volumne):name(name),volume(volumne){}

    string getname(){
        return name;
    }

};

int main(){
    shared_ptr<audioclip> audio = make_shared<audioclip>("explosion", 3.5);
    weak_ptr<audioclip> observer = audio;
    if(auto clip = observer.lock()){

        cout<< "Clip alive: " << clip->getname() << endl;
    }
    audio.reset();
    if(observer.expired()){
       cout << "Clip already unloaded." << endl;
    }
    
}
