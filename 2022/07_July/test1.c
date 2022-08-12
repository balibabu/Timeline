#include <stdio.h>
int main(){
    int i;
    for(i=10;i<=15;i++){
        while(i){
            do{
                printf("%d",1);
                if(i>>1) continue;
            }while(0);
            break;
        }
    }
    return 0;
} 