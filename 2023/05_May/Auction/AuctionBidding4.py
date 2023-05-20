def printing(list1):
    printed=[]
    for i in list1:
        if i not in printed:
            printed.append(i)
    for i in range(len(printed)-1):
        print('%s,%d,'%(printed[i][0],printed[i][1]),end='')
    print('%s,%d'%(printed[-1][0],printed[-1][1]),end='')

data=input().split(',')
startbid=int(data[0])
buyNowBid=int(data[1])
maz=int(data[3])
topay=int(data[0])
highestBidder=data[2]
array=[[highestBidder,topay]]
for i in range(4,len(data),2):
    bidder,bidValue=data[i],int(data[i+1])
    if bidValue<maz:
        topay=bidValue+1
    elif bidValue>maz:
        if bidder!=highestBidder:
            topay=maz+1
            highestBidder=bidder
        maz=bidValue
    else:
        topay=bidValue
        
    if topay>=buyNowBid:
        array.append([highestBidder,buyNowBid])
        break
    array.append([highestBidder,topay])

print('-,%s'%(data[0]),end=',')
printing(array)