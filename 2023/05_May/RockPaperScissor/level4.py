import math

def method4(rock,paper,scissor,attempt=0):
    str1='S'*scissor
    p=0
    # attempt=int(math.log2(len(str1)))-2
    while p!=paper:
        p+=1
        r=int(pow(2,p+attempt)-1)
        if rock>r:
            str1+='R'*r + 'P'
            rock-=r 
        else:
            str1+='R'*rock+'P'+'P'*(paper-p)
            rock=0
            break
    str1+='R'*rock
    return str1

def method11(rock,paper,scissor):
    str1='S'*scissor
    p=0
    if scissor%2==1:
        str1+='P'
        p=1

    starting=int(math.log2(len(str1)))-1
    while p!=paper:
        p+=1
        r=int(pow(2,p+starting)-1)
        if rock>r:
            str1+='P'+'R'*r 
            rock-=r 
        else:
            str1+='P'+'R'*rock+'P'*(paper-p)
            rock=0
            break
    str1+='R'*rock
    return str1

def methodAllRounder(rock,paper,scissor):
    gap=rock//paper
    for i in range(1,gap):
        # print('hi')
        s1=('P_r_R'*(paper-1)).replace('_r_',str(i))
        s3='S'*scissor
        a=rock-i*(paper-1)
        for j in range(a+1):
            s2=f'{j}R'+'P'+f'{a-j}R'
            str1=expand(s3+s2+s1)
            if getFinalWinner(str1) == 'S': return str1
    return 'idk'

def getFinalWinner(styles):
    a=afterOneRound(styles)
    while len(a)!=1:
        a=afterOneRound(a)
    return a
def getWinner(styles):
    if styles[0]==styles[1]: return styles[0]
    winner={'RP':'P','PR':'P','PS':'S','SP':'S','SR':'R','RS':'R'}
    return winner[styles]   
def afterOneRound(styles):
    remain=''
    for i in range(0,len(styles),2):
        remain+=getWinner(styles[i:i+2])
    return remain

def getStyle(terms):
    rock=int(terms[0][:-1])
    paper=int(terms[1][:-1])
    scissor=int(terms[2][:-1])

    if paper>=rock:
        str1='RP'*rock+'P'*(paper-rock)+'S'*scissor
        return str1

    str1=method11(rock,paper,scissor)
    if getFinalWinner(str1)=='S': return str1

    str1=method4(rock,paper,scissor)
    if getFinalWinner(str1)=='S': return str1
    
    str1=method4(rock,paper,scissor,attempt=int(math.log2(scissor)-2))
    if getFinalWinner(str1)=='S': return str1

    return methodAllRounder(rock,paper,scissor)


data=open('Inputs/level4_1.in')
lines=data.readlines()
output = ''
for i in range(1, len(lines)):
    terms = lines[i].split()
    styles=getStyle(terms)
    output += styles+'\n'
    # print(getFinalWinner(styles))
    if len(styles)==1: print(terms)
file1 = open('out1.txt', 'w')
file1.write(output)
file1.close()