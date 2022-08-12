# -*- coding: utf-8 -*-
"""
Created on Tue Aug 27 19:48:35 2019

@author: user
"""

def arra(a,b):
    if len(a)>len(b):
        c=len(b)
    else:
        c=len(a)
        
    for i in range(c):
        if ord(a[i])<ord(b[i]):
            return(a,b)
        elif ord(a[i])>ord(b[i]):
            return(b,a)
    if len(a)>len(b):
        return(b,a)
    else:
        return(a,b)

n=[]
for z in range(5):    
    n+=[input('enter name ').lower()]

for q in range(5):
    for w in range(q+1):
        c=arra(n[q],n[w])
        n[q],n[w]=c[1],c[0]
        
print(n)
    