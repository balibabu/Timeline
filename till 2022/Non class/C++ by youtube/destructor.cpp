#include <iostream>
using namespace std;
class Testing{
    public:
        Testing(){ //constructor is called when object is created
            cout<<"we are in constructor"<<endl;
        }
        ~Testing(){ //by default, destructor is called when program ends
            cout<<"we are in destructor"<<endl;
        }
};
int main(){
    Testing t1;
    cout<<"in main fuction"<<endl;
    return 0;
} 