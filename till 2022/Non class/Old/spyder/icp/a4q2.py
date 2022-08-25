a=input("enter a message")
print()
for i in range(1,115):
    if i%10==1 and i%100!=11:
        print(i,'st ',a)
    elif i%10==2 and i%100!=12:
        print(i,'nd ',a)
    elif i%10==3 and i%100!=13:
        print(i,'rd ',a)
    else:
        print(i,'th ',a)
        
        
            