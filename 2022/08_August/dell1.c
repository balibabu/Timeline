#include <stdio.h>
int main(){
    int p=fc(fc());
    return 0;
} 
int fc(){
    int m=4;
    m+=m<<2;
    printf("%d ",m|m+1&m-1);
}