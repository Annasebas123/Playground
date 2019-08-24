#include<stdio.h>
int main()
{
 int s,t,k,p;
  scanf("%d %d %d %d",&s,&t,&k,&p);
  t=s%10;
  k=(s%100)/10;
  p=t+k;
  printf("%d",p);  
  return 0;
}