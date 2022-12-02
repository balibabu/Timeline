import cv2

class Encoder:

    def encode(imgPath):
        img=cv2.imread(imgPath,0)
        img=Encoder.resizer(img)
        (thresh, blackAndWhiteImage) = cv2.threshold(img, 150, 255, cv2.THRESH_BINARY)
        value=Encoder.converter(img)
        print(value)
        cv2.imshow('win',img)
        cv2.waitKey(0)
        cv2.destroyAllWindows()


    def converter(grey_img):
        binImg=''
        for row in grey_img:
            binRow=''
            for col in row:
                binRow+=str(int(col>200))
            binImg+=' '+Encoder.compresser(binRow)
        return binImg[1:]

    def resizer(ori_img):
        height,width=ori_img.shape
        if 2*height>width:
            reFact=height/64
        else:
            reFact=width/128
        newSize=(int(width/reFact),int(height/reFact))
        return cv2.resize(ori_img,newSize)

    def compresser(string):
        newStr=''
        pointer=string[0]
        c=0
        for i in string:
            if pointer==i:
                c+=1
            else:
                newStr+=pointer+str(c)+','
                c=1
                pointer=i
        return newStr+pointer+str(c)