#include <stdio.h>
#include <math.h>
#include <string.h>

int main(){

  char baseSeventeen[17];
  long long decimal, place;

  int i = 0, val, len;
  decimal = 0;
  
  scanf("%s",baseSeventeen);

  len = strlen(baseSeventeen);
  len--;

  for(i = 0;baseSeventeen[i]!='\0';i++)
  {
    if(baseSeventeen[i]>='0'&& baseSeventeen[i]<='9'){

      val = baseSeventeen[i] - 48; // ASCIIvalues of 0 - 9 is 48 to 57
    }
    else if(baseSeventeen[i]>='a'&& baseSeventeen[i]<='g'){

      val = baseSeventeen[i] - 97 + 10; // ASCII values of 'a' to 'g' are 97 to 103
    }
    else if(baseSeventeen[i]>='A'&& baseSeventeen[i]<='G'){

      val = baseSeventeen[i] - 65 + 10; // ASCII value of 'A' to 'G' are 65 to 71
    }
    decimal = decimal + val * pow(17,len);
    len--;
  }
  printf("%lld",decimal);
  return 0;
}