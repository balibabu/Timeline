import os
import re
import pyperclip
import pyautogui as pg
import time

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

def shortPath(path):
    if len(path)>70:
        return path[:26]+'....'+path[-40::1]
    else:
        return path

def insights(*args):
    print('=================== insights ===================')
    print('found match:',args[0])
    print('Total file searched:',args[1])
    print('================================================\n')


def showInNotePad(path):
    print(path)
    os.startfile(path, 'open')
    if path[-5:]=='ipynb': time.sleep(2)
    time.sleep(0.5)
    pg.hotkey('ctrl', 'f') 
    time.sleep(0.5)
    pg.hotkey('ctrl', 'v')
    pg.press('enter')

def main():
    path1=r'D:\Works_Space\SOA_University'
    path2=r'D:\Works_Space\Timeline'
    x=getListOfFiles(path1)+getListOfFiles(path2)

    regex=input('enter keyword(regex) ')
    pyperclip.copy(regex)
    count=0
    outcome=list()
    for i in x:
        try:
            file=(readfiles(i))
            if isPresent(regex,file):
                outcome.append(i)
                count+=1
                print(count,'=>',shortPath(i))
        except:
            pass

    insights(count,len(x))

    if count==0:
        print('No matching found')
    elif count==1:
        showInNotePad(outcome[0])
    else:
        while(1):
            choice = int(input('enter an option number or 0 to quit:'))
            if choice == 0: break
            showInNotePad(outcome[choice-1])

if __name__ == '__main__':
    os.system("cls")
    main()