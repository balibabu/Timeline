def getInversion(arr,i,j):
    if arr[i]+arr[j]==1:
        inv=arr[:i]+list(map(lambda x:-x,arr[i:j][-1::-1]))+arr[j:]
    else: 
        inv=arr[:i+1]+list(map(lambda x:-x,arr[i+1:j+1][-1::-1]))+arr[j+1:]
    return inv

def getInvPairIndex(length,permu):
    opIndices=[]
    for i in range(length):
        for j in range(i+1,length):
            x,y=permu[i],permu[j]
            if (x<=0<=y or y<=0<=x) and not(x>=0 and y>=0) and not(x<0 and y<0):
                if abs(abs(x)-abs(y))==1:
                    opIndices.append((i,j))
    return opIndices
def getInvPairIndexWithMaxScore(length,permu):
    indices=getInvPairIndex(length,permu)
    result=[0,indices[0]]
    for index in indices:
        invArr=getInversion(permu,*index)
        score=len(getInvPairIndex(length,invArr))
        if score>=result[0]:
            result=[score,index]
    return result[1]
def getMinStepArrang(length,arr):
    count=0
    while not isSorted(arr):
        pair=getInvPairIndexWithMaxScore(length,arr)
        arr=getInversion(arr,*pair)
        count+=1
    return count
def isSorted(arr):
    for i in range(len(arr)-1):
        if arr[i]>arr[i+1]: return False
    return True

data=list(map(int,input().split()))
length=data[0]
permu=data[1:length+1]
print(getMinStepArrang(length,permu))