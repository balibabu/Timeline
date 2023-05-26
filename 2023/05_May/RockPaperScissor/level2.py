def afterOneRound(styles):
    remain=''
    for i in range(0,len(styles),2):
        remain+=getWinner(styles[i:i+2])
    return remain

def getWinner(styles):
    if styles[0]==styles[1]: return styles[0]
    winner={'RP':'P','PR':'P','PS':'S','SP':'S','SR':'R','RS':'R'}
    return winner[styles]

data=open('Inputs/level2_5.in')
lines=data.readlines()
numOfInputs=int(lines[0].split()[0])
str1=''
for i in range(numOfInputs):
    styles=lines[i+1][:-1]
    str1+=afterOneRound(afterOneRound(styles))+'\n'

file1=open('output.txt','w')
file1.write(str1)
file1.close()