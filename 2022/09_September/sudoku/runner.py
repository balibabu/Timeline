from image import Image
from extract import Extraction
from solver import Sudoku
from render import Render


def main():
    print('choose an option')
    print('solve sudoku from \n1.matrix 2.Image')
    choice=input()
    if choice=='1':
        mat1=eval(input('enter 9*9 matrix '))
        mat2=Sudoku.solve(mat1)
        print('\nsolution is given below\n')
        for i in mat2:
            for j in i:
                print(j,end=' ')
            print()
    elif choice=='2':
        imgObj=Image()
        imgObj.setImage(input('enter image path '))
        mat1=Extraction.extract(imgObj)
        # print(mat1)
        mat2=Sudoku.solve(mat1)
        # print(mat2)
        Render.render(imgObj, mat1, mat2)
        imgObj.display()
    else:
        print('wrong choice. exiting..')


    

if __name__ == '__main__':
    main()
