from author import *
nb=int(input('enter type of book present in library '))
ListOfBook=[]
for i in range(nb):
    ListOfBook.append(book())
obj1=student()
obj1.issueBook(ListOfBook)
print(obj1)
print('\nremaining books in library are\n')
for i in ListOfBook:
    print(i)