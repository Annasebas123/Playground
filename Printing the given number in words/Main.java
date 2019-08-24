#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  if(num<=5)
  {
    if(num==2)
    {
      printf("TWO");
    }
    if(num==3)
    {
      printf("Three");
    }
  }
  else
  {
    printf("Invalid");
  }
      
  
  
  return 0;
}