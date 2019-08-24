#include<stdio.h>
int main()
{
	int i,j;
  char str[1000];
  scanf("%[^\n]s",str);
  int len=strlen(str);
  int count=0;
 for(i=0;i<len;i++)
 {
   count=0;
    for(j=0;j<len;j++)
    {
      if((str[i]==str[j])&&(i!=j))
      {
        count=1;
      }
    }
      if(count==0)
      {
        printf("%c",str[i]);
        break;
      }
 }
  if(count==1)
  {
    printf("All the characters are repetitive");
  }
	return 0;
}