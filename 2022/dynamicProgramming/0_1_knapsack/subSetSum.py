# recursive and memoization approach
def subsetSumMemoization(array,sum1,n):
    table=[[-1 for _ in range(sum1+1)] for _ in range(n+1)]
    def subsetSum1(array,sum1,n):
        if sum1==0:             # base condition
            return True
        elif n==0:
            return False
        if table[n][sum1]!=-1:
            return table[n][sum1]
        if sum1>=array[n-1]:
            table[n][sum1]=subsetSum1(array,sum1-array[n-1],n-1) or subsetSum1(array,sum1,n-1)
            return table[n][sum1]
        else:
            table[n][sum1]= subsetSum1(array,sum1,n-1)
            return table[n][sum1]
    return subsetSum1(array,sum1,n)


# using top down approach
def subsetSum2(nums,sum1):
    array=[[False for _ in range(sum1+1)] for _ in range(len(nums)+1)]
    for i in range(len(nums)+1):
        array[i][0]=True        # assigning base condition

    for i in range(1,len(nums)+1): # n : row -->  i
        for j in range(1,sum1+1): # sums : col -> j
            if nums[i-1]<=j:
                array[i][j]=array[i-1][j-nums[i-1]] or array[i-1][j]
            else:
                array[i][j]=array[i-1][j]
    return array[-1][-1]

def main():
    nums=[2,3,5,9,10]
    sum1=11
    print(subsetSum2(nums,sum1))
    print(subsetSumMemoization(nums,sum1,len(nums)))

if __name__ == '__main__':
    main()

    