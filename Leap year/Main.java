#include<stdio.h>
int main()
{
  int month,test;
  scanf("%d %d",&month,&test);
  if(month%4==0)
  {
    printf("Leap year");
  }
  else
  {
    printf("Not Leap year");
  }
  return 0;
}