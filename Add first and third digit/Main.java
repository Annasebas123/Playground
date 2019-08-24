#include<stdio.h>
int main()
{
  int num,p;
  scanf("%d",&num);
  p=num/100+num%10;
  printf("%d",p);
  return 0;
}