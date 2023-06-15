for i in range(1,6):
    fileName='/level1_'+str(i)
    data=open('input'+fileName+'.in')
    lines=data.readlines()
    N=int(lines[0])
    prices=[int(lines[i]) for i in range(1,N+1)]
    minPriceId=0
    for i in range(N):
        if prices[minPriceId]>prices[i]:
            minPriceId=i
    f=open('output'+fileName+'.out','w')
    f.write(str(minPriceId))
    f.close()