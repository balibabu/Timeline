from encode import Encode
from decode import Decode

def main():
    print('Which action you wanna perform?\n1.Encoding 2.Decoding')
    choice=input()[0]
    imgPath=input('enter image path ')
    if choice=='1':
        obj=Encode(imgPath)
        obj.encode()
    else:
        obj2=Decode(imgPath)
        word=obj2.decode()
        print('decoded msg:',word)

if __name__ == '__main__':
    main()