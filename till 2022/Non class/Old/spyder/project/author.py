class Author:
    def __init__(self):
        self.name=input("enter author's name ")
        self.email=input("enter author's email id ")
        self.gender=input("enter author's gender[m/f] ")[0]
    def getfile(self):
        f=open()
    def __str__(self):
        return 'Author[name:{} email:{} gender:{}]'.format(self.name,self.email,self.gender)

class book(Author):
    def __init__(self):
        self.nameBook=input('enter name of book ')
        self.author=Author()
        self.price=int(input('enter price of book '))
        self.qty=int(input('enter quantity of book '))
    def __str__(self):
        return 'BOOK[name:{} price:{} quantity:{} {}]'.format(self.nameBook,self.price,self.qty,self.author)

class date:
    def __init__(self):
        self.yyyy=int(input('enter year '))
        self.mm=int(input('enter month '))
        self.dd=int(input('enter date '))
    def __str__(self):
        return '{}/{}/{}'.format(self.yyyy,self.mm,self.dd)

class student:
    def __init__(self):
        self.name=input('enter your name ')
        self.roll=int(input('enter your roll '))
    def issueBook(self,ListOfBook):
        self.issuedBook=[]
        for i in ListOfBook:
            print(i)
        ibook=input('which book you want to issue ')
        for i in ListOfBook:
            if ibook==i.nameBook:
                if i.qty>0:
                    self.issuedDate=date()
                    self.issuedBook.append(ibook)
                    i.qty-=1
                else:
                    print('out of stock')
                break
        else:
            print('there is no such book')
    def __str__(self):
        return 'Name:{} Roll:{} Book_issued:{} issued_Date:{}'.format(self.name,self.roll,self.issuedBook,self.issuedDate)
        