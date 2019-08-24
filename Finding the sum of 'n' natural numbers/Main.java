#include <stdio.h>

int main()
{
  int n;
  scanf("%d",&n);
  int sum=add(n);
  printf("%d",sum);
  return 0;
}
int add(int n)
{
  int sum;
  if(n==0)
  {
    return sum;
  }
  else
  {
    sum=n+add(n-1);
    return sum;
  }
}