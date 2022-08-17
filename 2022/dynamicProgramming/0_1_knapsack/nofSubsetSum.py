# Using recursion and memoization approach
def countSubSet(array,sum1,n):
    table=[[-1 for _ in range(sum1+1)]for _ in a+[1]]
    def countSubset(array,sum1,n):
        if sum1==0:
            return 1
        elif n==0:
            return 0
        if table[n][sum1]!=-1:
            return table[n][sum1]
        if array[n-1]<=sum1:
            table[n][sum1]= countSubset(array,sum1-array[n-1],n-1) + countSubset(array,sum1,n-1)
            return table[n][sum1]
        else:
            table[n][sum1]= countSubset(array,sum1,n-1)
            return table[n][sum1]
    return countSubset(array,sum1,n)

# Using top down approach
def countSubsetTD(array,sum1):
    table=[[0 for _ in range(sum1+1)] for _ in range(len(array)+1)]
    
    # base condition
    for i in range(len(table)):
        table[i][0]=1
    
    for i in range(1,len(table)): # i-> no. of items, n
        for j in range(1,len(table[0])): # j-> max wt, W
            if array[i-1]<=j:
                table[i][j]=table[i-1][j-array[i-1]]+table[i-1][j]
            else:
                table[i][j]=table[i-1][j]
    return table[-1][-1]

# a=[2,3,5,8,10]
# sum1=10
# print(countSubsetTD(a,sum1))
# print(countSubSet(a,sum1,len(a)))