import cv2, numpy

class Encoder:
    reqImg=None

    def encode(imgPath):
        def on_change(v):
            ret, thresh1 = cv2.threshold(img, v, 255, cv2.THRESH_BINARY)
            Encoder.reqImg=thresh1
            cv2.imshow('windowName',thresh1)

        bar = numpy.zeros((100,512,3), numpy.uint8)
        cv2.imshow('bar',bar)
        cv2.createTrackbar('slider', 'bar', 0, 255, on_change)

        img=cv2.imread(imgPath,0)
        img=Encoder.resizer(img)
        (thresh, blc) = cv2.threshold(img, 0, 255, cv2.THRESH_BINARY)
        cv2.imshow('windowName',blc)

        cv2.waitKey(0)
        cv2.destroyAllWindows()
        value=Encoder.converter(Encoder.reqImg)
        print(value)


    def converter(grey_img):
        binImg=''
        for row in grey_img:
            binRow=''
            for col in row:
                binRow+=str(int(col==255))
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