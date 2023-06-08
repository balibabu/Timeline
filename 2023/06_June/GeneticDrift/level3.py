def getOPList(length,permu):
    opList=[]
    for i in range(length):
        for j in range(i+1,length):
            x,y=permu[i],permu[j]
            if (x<=0<=y or y<=0<=x) and not(x>=0 and y>=0):
                if abs(abs(x)-abs(y))==1:
                    opList.append((permu[i],permu[j]))
    return opList

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

print(len(getOPList(length, arr)))
