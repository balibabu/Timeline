data=input().split(':')
rounds=int(data[0])
pins=data[1].split(',')

prevScore=0
i=0
while i<len(pins):
    rounds-=1
    score=0
    if int(pins[i])==10:
        score=int(pins[i+1])+int(pins[i+2])+10
        i+=1
    elif (int(pins[i])+int(pins[i+1]))==10:
        score=int(pins[i+1])+10
        i+=2
    else:
        score=int(pins[i])+int(pins[i+1])
        i+=2

    prevScore+=score

    if rounds==0:
        print(prevScore)
        break
    else:
        print(prevScore,end=',')
