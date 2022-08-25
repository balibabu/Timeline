def search(l,u,x,lst):
    if l>u:
        return False
    elif l==u:
        return bool(x==lst[l])
    else:
        return bool(search(l,(l+u)//2,x,lst)+search((l+u)//2+1, u, x, lst))



lst=[5,3,6,2,4,1,8]
print(search(0,len(lst)-1,7,lst))