n=int(input('enter a decimal number '))
o=''
while n>0:
    o=str(n%8)+o
    n=n//8
print(o)