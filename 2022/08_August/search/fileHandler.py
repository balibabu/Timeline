import os
import re
import pyautogui as pg
import time

class File:
    def readFile(filename):
        f=open(filename)
        temp= f.read()
        return temp

    def readPDF(filename,regex):
        import PyPDF2 as pdf
        binaryFile=open(filename,'rb')
        pdfObject=pdf.PdfReader(binaryFile)
        nofPages=pdfObject.numPages
        if nofPages>500:
            print(nofPages,'pages','skipped --> ',filename)
            return False
        for i in range(nofPages):
            page=pdfObject.getPage(i)
            content=page.extract_text()
            if re.search(regex,content,re.IGNORECASE):
                return True
        binaryFile.close()
        return False
    
    def readIpynb(filename,regex):
        import codecs
        import json
        f = codecs.open(filename, 'r')
        source = f.read()
        y = json.loads(source)
        pySource = '##Python .py code from .jpynb:\n'
        for x in y['cells']:
            for x2 in x['source']:
                pySource = pySource + x2
                if x2[-1] != '\n':
                    pySource = pySource + '\n'
        return re.search(regex,pySource,re.IGNORECASE)!=None

    def isPresent(key,content):
        x=re.search(key,content,re.IGNORECASE)
        return x!=None
        
    def openInApp(path):
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