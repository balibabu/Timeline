def getMax(dic):
    keyValues=list(dic.items())
    maxKeyValue=keyValues[0]
    for key,value in keyValues:
        if value > maxKeyValue[1]:
            maxKeyValue=key,value
    return maxKeyValue

def printing(list1):
    printed=[]
    for i in list1:
        if i not in printed:
            printed.append(i)
    for i in range(len(printed)-1):
        print('%s,%d,'%(printed[i][0],printed[i][1]),end='')
    print('%s,%d'%(printed[-1][0],printed[-1][1]),end='')

data=input().split(',')
bidders={data[1]:int(data[2])}
winner=[data[1],int(data[0])]
list1=[winner]
for i in range(3,len(data),2):
    bidder,bidValue=data[i],int(data[i+1])
    maxBidderValue=getMax(bidders)

    if bidValue > maxBidderValue[1]:
        if maxBidderValue[0]==bidder:
            bidders[bidder]=bidValue
        else:
            winner=[bidder,maxBidderValue[1]+1]
            bidders[bidder]=bidValue

    elif bidValue < maxBidderValue[1]:
        winner[1]=bidValue+1
        bidders[bidder]=bidValue
    
    else:
        winner[1]=bidValue
        bidders[bidder]=bidValue
    list1.append([winner[0],winner[1]])

print('-,%s'%(data[0]),end=',')
printing(list1)