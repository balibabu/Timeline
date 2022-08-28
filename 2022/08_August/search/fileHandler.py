import os
import re
import pyautogui as pg
import time

class File:
    def readFile(filename):
        f=open(filename)
        temp= f.read()
        return temp

    def isPresent(key,content):
        x=re.search(key,content,re.IGNORECASE)
        return x!=None
        
    def openInNotepad(path):
        print(path)
        os.startfile(path, 'open')
        if path[-5:]=='ipynb': time.sleep(2)
        time.sleep(0.5)
        pg.hotkey('ctrl', 'f') 
        time.sleep(0.5)
        pg.hotkey('ctrl', 'v')
        pg.press('enter')

    def insights(*args):
        print('=================== insights ===================')
        print('found match:',args[0])
        print('Total file searched:',args[1])
        print('================================================')