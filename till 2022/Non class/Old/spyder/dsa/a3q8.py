def power(x,n):
    if n==0:
        return 1
    else:
        return x*power(x,n-1)


x=int(input('enter value of x '))
n=int(input('enter value of n '))
print(power(x,n))