#include <stdio.h>
int main() {
	int n,r,s;
  scanf("%d",&n);
  r=n%10;
  while(n>9)
  {
    n=n/10;
  }  
  printf("%d",r+n);
	return 0;
}