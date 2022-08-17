# Target sum proble is same as count no of subset with give diff
# for eg:
# [1,1,2,3]
# [1,2]-[1,3] -> [1,-1,2,-3]

from nofSubsetWithDiff import nofSubset

arr=[7,7,17,1,46,38,8,32,35,18,43,48,9,17,6,6,42,10,2,32]
sum1=38
print(nofSubset(arr,sum1))