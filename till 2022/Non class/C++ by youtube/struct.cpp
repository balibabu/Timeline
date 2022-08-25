#include <iostream>
#include <cstring>
using namespace std;

struct Book{
    char name[20];
    char author[20];
    int id;
};

void printBook(struct Book book){
    cout<<"Book name: "<<book.name<<endl;
    cout<<"Author name: "<<book.author<<endl;
    cout<<"Book id: "<<book.id<<endl;
}

int main(){
    struct Book book1;
    strcpy(book1.name,"C++");
    strcpy(book1.author,"author");
    book1.id=6;
    printBook(book1);
    return 0;
} 