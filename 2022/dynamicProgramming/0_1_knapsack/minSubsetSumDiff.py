# Minimum Subset Sum Difference
def subsetSumTDHelp(nums,sum1):  # this is same as subset sum top down approach
    table=[[False for _ in range(sum1+1)] for _ in nums+[1]]
    for i in range(len(nums)+1):
        table[i][0]=True   # base condition
    
    for i in range(1,len(nums)+1):
        for j in range(1,sum1+1):
            if nums[i-1]<=j:
                table[i][j]=table[i-1][j-nums[i-1]] or table[i-1][j]
            else:
                table[i][j]=table[i-1][j]
    return table    # we need table for our actual problem

def minSubsetSumDiff(nums):
    mrange=sum(nums)
    table=subsetSumTDHelp(nums,mrange) # last row gives all possible subset sum
    halfSubsetsSum=[]
    for i in range(round(len(table[-1])//2)):
        if table[-1][i]:
            halfSubsetsSum.append(i)
    print(halfSubsetsSum)
    return mrange-2*halfSubsetsSum[-1]

# print(minSubsetSumDiff([1, 6, 11, 5]))