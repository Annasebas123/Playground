#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  int i,j;
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  int  count=0;
 for(j=0;j<n;j++)
 {
   if(arr[j]==1)
   {
     count++;
   }
   if(arr[j]!=1)
   {
     break;
   }
 }
  printf("%d",count);
  return 0;
}