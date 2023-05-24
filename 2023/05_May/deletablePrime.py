def isPrime(num):
    if num==1: return False
    for i in range(2,int(pow(num,0.5))+1):
        if num%i==0:
            return False
    return True

data=input()
def calculate(data):
    if len(data)==1:
        return 1 if isPrime(int(data)) else 0
    
    a=0
    for i in range(len(data)):
        newNum=data[:i]+data[i+1:]
        if isPrime(int(newNum)):
            # print(data[:i]+data[i+1:])
            a+=calculate(newNum)
    return a

print(calculate(data))