from datetime import *
class account:
    bnkid=0
    balance=0
    annualInterestRate=0
    dateCreated=datetime.now()
    def __init__(self,bnkid,balance,annualInterestRate):
        print('account created successfully, keep in touch with us....')
        self.bnkid=bnkid
        self.balance=balance
        self.annualInterestRate=annualInterestRate
        print('a/c no.:',self.bnkid)
        print('balance: ',self.balance)
        print('created date and time: ',self.dateCreated)
        print('\n')
    def getDateCreated(self):
        return self.dateCreated
    def getAnnualInterestRate(self):
        return self.annualInterestRate
    def getMonthlyInterestRate(self):
        return self.annualInterestRate/1200
    def getMonthlyInterest(self):
        return self.annualInterestRate*self.balance/1200
    def withdraw(self,amount):
        self.balance-=amount
        print(amount,' amount is debited from your a/c {}'.format(self.bnkid))
        print('now your current balance is ',self.balance)
    def deposite(self,amount):
        self.balance+=amount
        print('your a/c {} is credited with amount {}'.format(self.bnkid,amount))
        print('npw your total balance is ',self.balance)

person=account(1122,20000,4.5)
person.withdraw(2500)
person.deposite(3000)
print('monthly interest rate is ',person.getMonthlyInterestRate())
print('and monthly interest is ',person.getMonthlyInterest())
print('account was created on',person.getDateCreated())
print('bye')