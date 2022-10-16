import cv2

class Decode:
    def __init__(self,imgPath):
        self.img=cv2.imread(imgPath)

    def decodeSingleChar(self,binary):
        return chr(eval('0b'+binary))

    def decode(self):
        word=''
        binary=''
        zeros=0
        siz=0
        for rows in self.img:
            for row in rows:
                for i in range(len(row)):
                    if row[i]%2==0:
                        zeros+=1
                        binary+='0'
                    else:
                        zeros=0
                        binary+='1'
                    if zeros==8:
                        return word
                    siz+=1
                    if siz==8:
                        word+=self.decodeSingleChar(binary)
                        binary=''
                        siz=0
        return word