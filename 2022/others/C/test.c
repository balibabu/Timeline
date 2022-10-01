#include <stdio.h>
#include <string.h>
#include <math.h>
int getInt(char c){
    if(c=='G'){
        return 16;
    }else if(c=='A'){
        return 10;
    }else if(c=='B'){
        return 11;
    }else if(c=='C'){
        return 12;
    }else if(c=='D'){
        return 13;
    }else if(c=='E'){
        return 14;
    }else if(c=='F'){
        return 15;
    }else{
        return atoi(c);
    }
}
int main(){
    char s[30];
    scanf("%s", s);
    int num=0;
    int pos=0;
    int i=0;
    // printf("%d\n",strlen(s));23GF
    
    for(i=strlen(s)-1;s[i]!='\0';i--){
        printf("%c ",s[i]);
        printf("%d\n",i);
        num+=getInt(s[i])*pow(17,pos++);
        printf("%d\n",num);
        
    }
    // num+=getInt(s[0])*pow(17,pos++);
    printf("%d\n",num);
    
    return 0;
} 