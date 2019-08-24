#include<stdio.h>
int main()
{
	int n;
  scanf("%d",&n);
  int fact=factorial(n);
  printf("%d",fact);
  
	return 0;
}
int factorial(int n)
{
  if((n==0)||(n==1))
  {
    return 1;
  }
  else
  {
    int fact=n*factorial(n-1);
    return fact;
  }
	return 0;
}