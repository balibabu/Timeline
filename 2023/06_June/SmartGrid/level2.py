def getResult(fileName):
    data=open(f'input/{fileName}.in')
    lines=data.readlines()
    N=int(lines[0])
    prices=[int(lines[i]) for i in range(1,N+1)]
    M=int(lines[N+1])
    taskIdAndComplTime=[tuple(map(int,lines[i].split())) for i in range(N+2,N+2+M)]
    def getMinPriceStartId(N,prices,minutes):
        startId=0
        for i in range(0,N-minutes+1):
            tempPriceSum=sum(prices[i:i+minutes])
            if tempPriceSum<sum(prices[startId:startId+minutes]):
                startId=i
        return startId
    f=open(f'output/{fileName}.out','w')
    f.write(f'{M}\n')
    for task,minutes in taskIdAndComplTime:
        startId=getMinPriceStartId(N,prices,minutes)
        f.write(f'{task} {startId}\n')
    f.close()
for i in range(5):
    getResult(f'level2_{i+1}')