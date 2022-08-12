# this programs find the permutation of word

def stor(a):
	w=[]
	for i in a:
		w.append(i)
	return(w)
	
def final(a,total):
	t=stor(a)
	for i in range(len(a)-1,0,-1):
		a[0],a[i]=a[i],a[0]
		if chk(total,word(a))==1:
			total=change(total,a)
		else:
			a=t
	return

def chk(total,w):
	for i in total:
		if i==w:
			return(0)
	return(1)


def word(a):
	w=''
	for i in range(len(a)):
		w=w+a[i]
	return(w)

def change(total,a):
	d=0
	while d<=(len(a)-1):
		t=stor(a)
		a[len(a)-1-d],a[len(a)-2-d]=a[len(a)-2-d],a[len(a)-1-d]
		w=word(a)
		if chk(total,w)==1:
			total.append(w)
			d=0
		else:
			a=t
			d=d+1
		if d==len(a)%4:
			final(a,total)
	return(total)

string=input('enter a word ')
arr=[]
for i in string:
	arr.append(i)
total=[string]	
total=change(total,arr)
for i in total:
	print(i,end='   ')
print()
print(len(total))