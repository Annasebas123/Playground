#include<stdio.h>
int main()
{
	
	int n,i,j,k;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(j=0;j<n;j++)
  {
    for(k=j;k<n;k++)
    {
      if(arr[j]<arr[k]&&arr[k]>arr[k-1])
      {
        printf("%d,%d\n",arr[j],arr[k]);
      }
    }
  }
	return 0;
}