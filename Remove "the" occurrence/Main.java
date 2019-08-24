#include<stdio.h>
int main()
{
	int i,j;
  char str[1000];
  scanf("%[^\n]s",str);
  int len=strlen(str);
  char arr[2*len];
  int idx=0;
 for(i=0;str[i]!='\0';i++)
 {
   if((str[i]=='t'||'T')&&(str[i+1]=='h')&&(str[i+2]=='e'))
   {
     i=i+3;
   }
   else
   {
     arr[idx]=str[i];
     idx++;
   }
 }
   arr[idx]='\0';
  printf("%s",arr);
	return 0;
}