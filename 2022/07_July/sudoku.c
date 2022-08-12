/* 
Given a partially filled 9X9 matrix with numbers from 1 to 9 
Complete the entire matrix by using the concept of sudoku and print 
all the possible solutions for the given matrix. 
32 
0 0 3
0 2 6 
0 3 5 
0 5 8
0 6 4 
1 0 5
1 1 2 
2 1 8 
2 2 7 
2 7 3 
2 8 1 
3 2 3 
3 4 1 
3 7 8 
4 0 9 
4 3 8 
4 4 6 
4 5 3 
4 8 5 
5 1 5 
5 4 9 
5 6 6 
6 0 1 
6 1 3 
6 6 2 
6 7 5 
7 7 7 
7 8 4 
8 2 5 
8 3 2 
8 5 6 
8 6 3
*/

#include<stdio.h> 
#include<stdlib.h>
void print(int *mat[])
{
    int i,j;
    for(i=0;i<9;i++,printf("\n"))
    {
        for(j=0;j<9;j++)
          printf("%d ",mat[i][j]);
    }
    printf("\n\n");
}
int safe(int *mat[],int row,int col,int d) //row=0  col=4
{
   int i,j;
   for(j=0;j<9;j++)  //row
   {
       if(mat[row][j]==d)
           return 0;
   }
   for(i=0;i<9;i++)  //col
   {
       if(mat[i][col]==d)
        return 0;
   }
   int x,y;
   x=row/3;
   y=col/3;
   x=x*3;
   y=y*3;
   for(i=x;i<=x+2;i++) //3 X 3  grid
   {
       for(j=y;j<=y+2;j++) 
        {
            if(mat[i][j]==d)
              return 0;
        }
   }
    return 1;
}
void sudoku(int *mat[],int row,int col) //row=0  col=4
{
    if(row==8 && col==9) 
       print(mat);
    else 
    {  
       if(col==9)
       {
         row++;
         col=0;
       }
       if(mat[row][col]==0)  
       {
          for(int d=1;d<=9;d++)
          {
              if(safe(mat,row,col,d)==1)
              {
                  mat[row][col]=d;
                  sudoku(mat,row,col+1);
                  mat[row][col]=0;
              }
          }
       }
       else 
       {
          sudoku(mat,row,col+1);  
       }
    }
}
int main()
{   
    int i,j;
    int *mat[9];
    for(i=0;i<9;i++)
      mat[i]=(int*)calloc(9,sizeof(int));
    int n,r,c,val;
    scanf("%d",&n); //32 
    for(i=1;i<=n;i++)
    {
        scanf("%d %d %d",&r,&c,&val);  
        mat[r][c]=val; 
    }
    sudoku(mat,0,0); //sudoku(mat,row,col)
}
