# Recursion and Memoization Approach
def unbndKnapsackMem(weight:list,value:list,W,n): # items list, max Weight bag can hold, no. of items in list
    table=[[-1 for _ in range(W+1)]for _ in range(n+1)]
    def solve(weight,value,W,n):
        if W==0 or n==0:
            return 0
        if table[n][W]!=-1:
            return table[n][W]
        if weight[n-1]<=W:
            table[n][W]= max( value[n-1]+solve(weight,value,W-weight[n-1],n),  solve(weight,value,W,n-1))
            return table[n][W]
        else:
            table[n][W]= solve(weight,value,W,n-1)
            return table[n][W]
    return solve(weight,value,W,n)


# Top Down approach
def unbndKnapsackTD(weight:list,value:list,W):
    table=[[-1 for _ in range(W+1)]for _ in range(len(weight)+1)]
    for i in range(W+1):    # base condition when w==0
        table[0][i]=0
    for i in range(len(table)):  # base condition when n==0
        table[i][0]=0
    
    for i in range(1,len(table)):
        for j in range(1,len(table[0])):
            if weight[i-1]<=j:
                table[i][j]=max(value[i-1]+table[i][j-weight[i-1]], table[i-1][j])
            else:
                table[i][j]=table[i-1][j]

    return table[-1][-1]

