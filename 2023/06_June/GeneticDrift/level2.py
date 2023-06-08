data=list(map(int,input().split()))
length=data[0]
permu=data[1:length+1]
inversionPairWithIndex=data[length+1:]
xi,i,xj,j=inversionPairWithIndex
if xi+xj==1:
    loop=range(i,j)
else:
    loop=range(i+1,j+1)
arr=permu[:loop[0]]
invArr=[]
for pos in loop:
    invArr.append(permu[pos]*(-1))
arr+=invArr[-1::-1]+permu[loop[-1]+1:]
for i in arr:
    print(i,end=' ')
