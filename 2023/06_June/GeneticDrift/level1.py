data=list(map(int,input().split()))
data
length=data[0]
permu=data[1:]
def getOPList(length,permu):
    opList=[]
    for i in range(length):
        for j in range(i+1,length):
            x,y=permu[i],permu[j]
            if (x<=0<=y or y<=0<=x) and not(x>=0 and y>=0):
                if abs(abs(x)-abs(y))==1:
                    opList.append((permu[i],permu[j]))
    return opList
    
opList=getOPList(length,permu)
opList.sort()
print(len(opList),end=' ')
for x,y in opList:
    print(x,y,end=' ')