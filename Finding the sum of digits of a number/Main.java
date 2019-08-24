#include <stdio.h>
int main() {
	int num1,r;
  scanf("%d ",&num1);
  int sum=0;
  while(num1!=0)
  {
    r=num1%10;
     sum=sum+r; 
    num1=num1/10;
    
  }
  printf("%d",sum);
	return 0;
}