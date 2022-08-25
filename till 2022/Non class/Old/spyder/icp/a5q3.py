c=0
for i in range(100,1001):
    if i%5==0 or i%6==0:
        print(i,end='  ')
        c+=1
        if c%10==0:
            print()