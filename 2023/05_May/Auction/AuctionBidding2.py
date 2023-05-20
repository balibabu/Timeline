def getMax(dic):
    keyValues=list(dic.items())
    maxKeyValue=keyValues[0]
    for key,value in keyValues:
        if value > maxKeyValue[1]:
            maxKeyValue=key,value
    return maxKeyValue


data=input().split(',')
bidders={data[1]:int(data[2])}
winner=[data[1],data[0]]
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

print(winner[0],end=',')
print(winner[1])