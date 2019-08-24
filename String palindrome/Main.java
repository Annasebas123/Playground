#include<stdio.h>
int main()
{
  char str[1000];
  scanf("%[^\n]s",str);
  int len=strlen(str);
  int flag=1,i=0,j=len-1;
  while(i<j)
  {
    if(str[i]==str[j])
    {
      i++;
      j--;
    }
  
    else
    {
      flag=0;
      break;
    }
  }  
  if(flag==1)
  {
    printf("%s is a palindrome",str);
  }
  else
  {
    printf("%s is not a palindrome",str);
  }

  return 0;
}