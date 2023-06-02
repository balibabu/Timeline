def removeValue(num,nums,startPos):
    while startPos in nums.keys():
        if num in nums[startPos]:
            nums[startPos].remove(num)
            return
        startPos+=1

def find_combination(target, nums):
    def backtrack(start, curr_sum, path):
        if curr_sum == target:
            return path[:]
        if curr_sum > target or len(path) >= 4:
            return None

        for i in range(start, len(nums)):
            path.append(i)
            result = backtrack(i + 1, curr_sum + nums[i], path)
            if result:
                return result
            path.pop()

    return backtrack(0, 0, [])



data=input().split()
earning={}
payment=dict()
for i in range(0,len(data),3):
    date=int(data[i+1])
    geld=int(data[i+2])
    if data[i]=='F':
        earning[date]=geld
    else:
        if date not in payment.keys(): payment[date]=[geld]
        else: payment[date].append(geld)

for i in earning:
    eligibleList=[]
    j=i
    while j in payment.keys():
        eligibleList+=payment[j]
        j+=1
    pos=find_combination(earning[i],eligibleList)
    if pos:
        for p in pos:
            removeValue(eligibleList[p],payment,i)
    else:
        print(i,end=' ')