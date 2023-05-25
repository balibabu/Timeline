def getFibbo(n):
    if n<=1: return n
    a,b=0,1
    for i in range(1,n):
        c=a+b 
        a=b
        b=c
    return c
data=int(input())
print(getFibbo(data))