#include <stdio.h>
int a=5,b=8;
int main(){
    if(!(!b)||a){
        printf("%d\n",fig(b));
        
    }
    return 0;
} 

int fig(int v){
    return ((v--) && v+1);
}