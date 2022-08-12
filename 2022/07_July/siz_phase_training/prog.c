#include<stdio.h> 
#include<string.h>   
int max(int a,int b)
{
    return ((a>b)?a:b);
}
int main() 
{
    char s1[10000],s2[10000]; 
    scanf("%s %s",s1,s2); 
    int l1,l2; 
    l1=strlen(s1); 
    l2=strlen(s2);  
    int mat[l1+1][l2+1]; 
    int i,j; 
    for(i=0;i<=l1;i++)
    {
        for(j=0;j<=l2;j++)
        {
            if(i==0 || j==0)
            {
                mat[i][j]=0;
            }
            else if(s1[i-1]==s2[j-1]) //1 row 0
            {
                mat[i][j]=1+mat[i-1][j-1];
            }
            else 
            {
                mat[i][j]=max(mat[i-1][j],mat[i][j-1]);
            }
        }
    }
    printf("%d ",mat[l1][l2]);
}
