def fibonasic(a,b,n):
    if n==1:
        return a
    else:
        c=a
        a=b
        b=c+b
        return fibonasic(a,b,n-1)
        
print(fibonasic(1,1,6))
    