import copy
class Sudoku:
    def solve(mat):
        mat2=copy.deepcopy(mat)
        if not Sudoku.isSolved(mat2,0,0):
            print('cannot solve this sudoku')
        return mat2

    def underRules(matrix,num,x,y):
        for i in range(9):
            if num==matrix[x][i] or num==matrix[i][y]:   # condition for row and column
                return False 
        # in sub boxes
        row=(x//3)*3
        col=(y//3)*3
        for i in range(row,row+3):
            for j in range(col,col+3):
                if num==matrix[x][y]:
                    return False
        return True

    def isSolved(mat,r,c):
        if c==9:
            r+=1
            c=0
        if r==9:
            return True
        if mat[r][c]==0:
            for i in range(1,10):
                if Sudoku.underRules(mat,i,r,c):
                    mat[r][c]=i
                    if Sudoku.isSolved(mat,r,c+1):
                        return True
                    else:
                        mat[r][c]=0
            return False
        else:
            return Sudoku.isSolved(mat,r,c+1)