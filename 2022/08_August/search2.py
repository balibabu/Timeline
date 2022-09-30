import os
import re
def getListOfFiles(dirName):
    fTypes=['java','py','c','txt','ipynb','cpp']
    listOfFile = os.listdir(dirName)
    allFiles = list()
    for item in listOfFile:
        if re.search('^\.|^djangorest',item):
            continue #djangorest
        fullPath = os.path.join(dirName, item)
        if os.path.isdir(fullPath):
            allFiles = allFiles + getListOfFiles(fullPath)
        else:
            if not os.path.splitext(item)[1][1:] in fTypes:
                continue
            allFiles.append(fullPath)
    return allFiles

def readfiles(fname):
    f=open(fname)
    temp= f.read()
    return temp

def isPresent(regex,string):
	x=re.search(regex,string,re.IGNORECASE)
	return x!=None

def main():
    path1=r'D:\WorkSpace\SOA_University'
    path2=r'D:\WorkSpace\Timeline'
    x=getListOfFiles(path1)+getListOfFiles(path2)

    regex=input('enter keyword(regex) ')
    count=0
    outcome=list()
    for i in x:
        try:
            file=(readfiles(i))
            if isPresent(regex,file):
                outcome.append(i)
                count+=1
                print(count,'=>',i)
        except:
            pass
    print('found match:',count)
    print('Total file searched:',len(x))
    if count==0:
        print('No matching found')
    elif count==1:
        print(readfiles(outcome[0]))
    else:
        while(1):
            choice = int(input('enter an option number or 0 to quit:'))
            if choice == 0: break
            print(readfiles(outcome[choice-1]))

if __name__ == '__main__':
    main()