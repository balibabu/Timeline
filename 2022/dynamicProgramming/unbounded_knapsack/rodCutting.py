# Rod cutting Problem using top down approach
def rodCutting(lengths,prices,size):
    table=[[-1 for _ in range(size+1)] for _ in lengths+[1]]

    for i in range(len(table)):
        table[i][0]=0   # base cond : if size=0 then profit=0
    for i in range(len(table[0])):
        table[0][i]=0   # base cond : if profit=0 then size=0
    
    for i in range(len(table)): # this is piece : n
        for j in range(len(table[0])):  # this is size : w
            if lengths[i-1]<=j:
                table[i][j]=max(prices[i-1]+table[i][j-lengths[i-1]],table[i-1][j])
            else:
                table[i][j]=table[i-1][j]
    return table[-1][-1]

