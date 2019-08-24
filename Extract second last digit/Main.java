#include<stdio.h>
int main()
{
 int num,s;
  scanf("%d %d",&num,&s);
  s=((num%100)/10);
  printf("%d",s);
  return 0;
}