#include <iostream>
using namespace std;
class Book{
    private:
        string name;
        string author;
        int id;
    public:
        Book(string name,string author,int id){ //constructor
            Book::name=name;
            Book::author=author;
            Book::id=id;
        }
        void printBook(){
            cout<<"Book name: "<<name<<endl;
            cout<<"Author name: "<<author<<endl;
            cout<<"Book id: "<<id<<endl;
        }
};
int main(){
    Book book1("c++","ram",112);
    book1.printBook();
    return 0;
} 