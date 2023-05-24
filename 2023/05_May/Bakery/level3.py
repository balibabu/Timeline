def composed1(array,i,amt,list1):
    if amt==0: return True 
    elif i==len(array): return False

    if amt>=array[i]:
        taken=composed1(array,i+1,amt-array[i],list1)
        notTaken=composed1(array,i+1,amt,list1)
        if taken: list1.append(i)
        return taken or notTaken
    else:
        return False


data=input().split()
amount=[]
payment=[]
for i in range(0,len(data),3):
    geld=(data[i+1],data[i+2])
    if data[i]=='F':
        amount.append(geld)
    else:
        payment.append(geld)

array=[int(j) for i,j in payment]
for i,j in amount:
    indexes=[]
    composed1(array,0,int(j),indexes)
    if 0<len(indexes)<=4:
        for index in indexes:
            array.pop(index)
    else:
        print(i,end=' ')