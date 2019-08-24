#include<stdio.h>
int nosum (int m)
{
  int sum;
  sum=(m*(m+1))/2;
  return sum;
}
int main() {
    int op,n;
  scanf("%d",&n);
  op=nosum(n);
  printf("%d",op);
  	return 0;
}