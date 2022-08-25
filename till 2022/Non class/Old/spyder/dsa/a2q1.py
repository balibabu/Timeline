class commission:
    def __init__(self,sales):
        self.sales=sales
    def getCommission(self):
        if self.sales<500:
            return 0.02*self.sales
        elif self.sales<5000:
            return 0.05*self.sales
        else:
            return 0.08*self.sales

sale=int(input('enter amount of sales ' ))
if sale>0:
    person=commission(sale)
    print('your commission is ',person.getCommission())   
else:
    print('Invalid input')         