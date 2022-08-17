# find number of ways you can give change using coins(given)

# recursion and memoization approach
def coinChangeMem(coins,change):
    table=[[-1 for _ in range(change+1)]for _ in coins+[1]]
    def _solve(coins,change,n):
        if change==0:
            return 1    # base cond: if change=0 then we can give {}
        if n==0:
            return 0    # base cond: if change>0 and no. of coins is 0 then we can't give
        
        if table[n][change]!=-1:
            return table[n][change]

        if coins[n-1]<=change:
            table[n][change]= _solve(coins,change-coins[n-1],n)+_solve(coins,change,n-1)
            return table[n][change]
        else:
            table[n][change]= _solve(coins,change,n-1)
            return table[n][change]
    return _solve(coins,change,len(coins))

# topdown approach
def coinChangeTD(coins,change):
    table=[[-1 for _ in range(change+1)]for _ in coins+[1]]
    for i in range(len(table[0])):
        table[0][i]=0       # base cond: if change>0 and no. of coins is 0 then we can't give
    for i in range(len(table)):
        table[i][0]=1       # base cond: if change=0 then we can give {}
    
    for i in range(1,len(table)):   # coins --> index: i-1
        for j in range(1,len(table[0])): #change --> j
            if coins[i-1]<=j:
                table[i][j]=table[i][j-coins[i-1]]+table[i-1][j]
            else:
                table[i][j]=table[i-1][j]
    return table[-1][-1]