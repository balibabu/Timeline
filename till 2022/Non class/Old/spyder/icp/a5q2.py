n=int(input('enter the no. of student'))
pas=0
c=1
while c<=n:
    m=int(input('enter mark of student {}  :'.format(c)))
    if m<=100 and m>=40:
        pas+=1
    elif m<40 and m>=0:
        pass
    else:
        print('invalid mark enter again') 
        c=c-1
    c+=1
print('total number of pass student is ',pas)