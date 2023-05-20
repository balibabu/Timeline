data=input().split(',')
visualPrice=data[0]
maxBid=0
winner=[None,maxBid]
for i in range(1,len(data),2):
    bidder,bidValue=data[i],int(data[i+1])
    if bidValue > winner[1]:
        visualPrice=winner[1]+1
        winner=[bidder,bidValue]
    elif bidValue < winner[1]:
        visualPrice=bidValue+1
    else:
        visualPrice=winner[1]

print(winner[0],end=',')
print(visualPrice)