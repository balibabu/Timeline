def rev(n):
    if n==0:
        return
    print(n%10,end='')
    n=n//10
    rev(n)

n=int(input('enter a number '))
rev(n)