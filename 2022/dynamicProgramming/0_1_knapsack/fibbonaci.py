# without using memoization
def fibonaci1(n):
    if n==0 or n==1:
        return n
    return fibonaci1(n-2)+fibonaci1(n-1)
print(fibonaci1(37))


# with memoization
def fibonaci2(n):
    global array
    if n==0 or n==1:
        return n
    if array[n]!=-1:
        return array[n]
    
    array[n]= fibonaci2(n-2)+fibonaci2(n-1)
    return array[n]

n=37
array=[-1 for _ in range(n+1)]
print(fibonaci2(n))