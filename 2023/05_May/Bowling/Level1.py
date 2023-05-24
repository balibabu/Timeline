data=input().split(':')
rounds=int(data[0])
pins=data[1].split(',')
prevScore=0
for i in range(0,rounds*2,2):
    score=int(pins[i])
    if score==10:
        score=int(pins[i+1])+int(pins[i+2])+int(pins[i+3])
    elif (score+int(pins[i+1]))==10:
        score+=int(pins[i+1])+int(pins[i+2])
    else:
        score+=int(pins[i+1])
    prevScore+=score
    if i==rounds*2-2:
        print(prevScore)
    else:
        print(prevScore,end=',')
