n=0
p=0
t=0
print('enter an integer, input ends if it is 0\n')
while True:
    x=int(input())
    t+=x
    if x>0:
        p+=1
    elif x<0:
        n+=1
    else:
        break
print('the no. of positives is ',p)
print('the no. of negatives is ',n)
print('total sum is ',t)
print('average is ',t/(p+n))