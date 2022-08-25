m=621594
s=0
while m!=0:
    s+=m%10
    m=m//10
if s%9==0:
    print('n is divisible by 9')
else:
    print('not divisible by 9')