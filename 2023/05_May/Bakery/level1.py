data=input().split()
stack=''
for i in range(0,len(data)//2,3):
    if data[i+2]!=data[len(data)//2+i+2]:
        stack+=data[i+1]+' '
print(stack)