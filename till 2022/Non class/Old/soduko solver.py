#to check is there any 0 left in soduko
def zero():
		finish=1
		for ba in range(9):
			for li in range(9):
				if t[ba][li]==0:
					finish=0
		return(finish)

#to check whether soduko is complete
def cmplit():
	finish,z=0,0
	while finish==0:
		z+=1
		sotcut()
		rand()
		finish=1
		finish=zero()
		if z==10:
			finish=1
	return()




#========================								
# PRINTING FUNCTION
#========================				
def prt():
	for n in range(9):
		for o in range(9):
			print(t[n][o],end=' ')
			if o==2 or o==5 :
				print(' ',end=' ')
			
		if n==2 or n==5:
			print()
		print()
		
		
#========================								
# CONFIRMED VALUE PUTTING
#========================			
def sotcut():
	for all in range(0,9,3):
		for well in range(0,9,3):
			for rnd in range(1,10):
				cc=0
				for i in range(all,all+3):
					for j in range(well,well+3):
						if t[i][j]==0 and chk(i,j,rnd)==0:
							valt=rnd
							ii,jj=i,j
							cc+=1
				if cc==1:
					t[ii][jj]=valt
	return()

#========================								
# RANDOM CONFIRMED VALUE PUTTING
#========================			
def rand():
	for i in range(9):
		for j in range(9):
			cnt=0
			valu=0
			for k in range(1,10):
				if t[i][j]==0 and chk(i,j,k)==0:
					cnt+=1
					valu=k
			if cnt==1:
				t[i][j]=valu
	
#========================
#RULES FOLLOWING FUNCTION
#========================
def chk(i,j,k):
	c=0
	for m in range(9):
		if k==t[i][m] or k==t[m][j]:
			c+=1	
	if i<3:
		si=0
	elif i<6:
		si=3
	else :
		si=6	
	if j<3:
		sj=0
	elif j<6:
		sj=3
	else :
		sj=6		
	for ck1 in range(si,si+3):
		for ck2 in range(sj,sj+3):
			if k==t[ck1][ck2]:
				c+=1
	return(c)

	
#========================			
#DATA ENTERING PART
#========================
def datas():
	a=[0,6,2,5,0,4,0,7,0]
	b=[0,8,0,0,0,0,4,0,9]
	c=[0,0,0,0,2,0,0,0,1]
	d=[0,0,1,0,0,6,0,8,4]
	e=[0,0,9,0,0,8,0,0,7]
	f=[8,0,7,9,0,0,0,0,3]
	g=[0,0,0,7,0,0,8,3,0]
	h=[2,0,0,6,0,3,0,0,0]
	ii=[7,0,0,0,0,0,0,0,0]
	t=[a,b,c,d,e,f,g,h,ii]
	return(t)
	
		
#program starts from here	
t=datas()
print('THIS IS YOUR QUESTION')
print()
prt()
print('========================')
print()


#========================			
#MAIN PROCESSING PART
#========================

cmplit()
if zero()==0:
	for i in range(9):
		for j in range(9):
			if t[i][j]==0:
				print()
				for k in range(1,10):
					if chk(i,j,k)==0:
						t[i][j]=k
						cmplit()
						if zero()==0:
							t=datas()
							cmplit()
							print('working',end=' ')
	

#printing the output
print('THIS IS YOUR ANSWER')
print()								
prt()