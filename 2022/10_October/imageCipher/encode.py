import cv2
class Encode:

    def __init__(self,imgPath):
        self.img=cv2.imread(imgPath,1)

    def getBinDigits(self):
        word=self.word
        digits=''
        for i in word:
            binary=bin(ord(i)).replace('0b','')
            digits+=(8-len(binary))*'0'+binary
        return digits

    def encode(self):
        width,height,channel=self.img.shape
        maxCharLength=width*height*channel//8
        self.word=input(f'enter word to hide[max chars:{maxCharLength}] ')
        assert len(self.word)<maxCharLength,'size limit exceed'
        self._encode()
        cv2.imwrite('cipherImg.png',self.img)
        print('word is hidden in image: cipherImg.png')
        print('encoded msg:',self.word)

    def _encode(self):
        binary=self.getBinDigits()+'0'*8
        char_length=len(binary)
        pos=0
        for rows in self.img:
            for row in rows:
                for i in range(len(row)):
                    if row[i]%2!=int(binary[pos]):
                        row[i]-=1 if row[i]>0 else -1
                    pos+=1
                    if pos==char_length:
                        return

        
