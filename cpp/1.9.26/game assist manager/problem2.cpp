#include<iostream>
using namespace std;
#include<memory>
class shader{
    string name ;
    string type;
    public:
    shader(string name , string type="fragment"):name(name),type(type){
        cout<<"shader complied"<<endl;
    }
    int getReferenceCount(shared_ptr<shader> &s) {// use & kyuki iska bina value pass by copy hogi toh use_count() badhega
       return s.use_count();
    }

~shader(){
    cout<<"shader destroyed"<<endl;
}
};
int main(){


auto Shader = make_shared<shader>("main_vert", "vertex");
cout << "Ref count: " << Shader->getReferenceCount(Shader) << endl; // 1
{
 auto rendererRef = Shader;
 cout << "Ref count: " << rendererRef->getReferenceCount(rendererRef) << endl; // 2

 auto editorRef = Shader;
 cout << "Ref count: " <<editorRef->getReferenceCount(editorRef) << endl; // 3
}

cout << "Ref count: " << Shader->getReferenceCount(Shader) << endl; 
}