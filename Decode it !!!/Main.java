#include<stdio.h>
int main()
{
  char string[100];
   scanf("%[^\n]s", string);
   int str_len = strlen(string);
  int k;
  scanf("%d",&k);
   for (int index = 0; index < str_len; index++)
   {
        if((string[index] >= 'A') && (string[index] <= 'Z'))
        {
          int h=k%26;
            char ch = string[index]-h;
          
          if(string[index]<h)
          {
           ch='Z'-(string[index]-h);
          }
         string[index] = ch;
        }
  else if((string[index] >= 'a') && (string[index] <= 'z'))
        {
    int h=k%26;
     char ch = string[index]-h;
  
    if(ch<97)
          {
            ch=ch+26;
          }
            string[index] = ch;
  }
     else
     {
       char ch = string[index];
            string[index] = ch; 
   }
   }
  printf("%s",string);
     
  return 0;
}