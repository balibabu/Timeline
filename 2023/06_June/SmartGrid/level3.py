
def solve(fileName):
    data=open(f'input/{fileName}.in')
    lines=data.readlines()
    N=int(lines[0])
    prices=[int(lines[i]) for i in range(1,N+1)]
    M=int(lines[N+1])
    tskPowStEn=[tuple(map(int,lines[i].split())) for i in range(N+2,N+2+M)]

    str1=f'{M}\n'
    for tskId,pw,st,ed in tskPowStEn:
        priceId=st
        for i in range(st,ed+1):
            if prices[priceId]>prices[i]:
                priceId=i
        str1+=f'{tskId} {priceId} {pw}\n'

    f=open(f'output/{fileName}.out','w')
    f.write(str1)
    f.close()

for i in range(5):
    solve(f'level3_{i+1}')