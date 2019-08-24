#include<stdio.h>
int main()
{
	int n,i,j;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=0;i<n/2-1;i++)
  {
    for(j=0;j<n/2-1;j++)
    {
      if(arr[j]>arr[j+1])
      {
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
           }
            }
            }
            
            for(int k=0;k<n;k++)
            {
              printf("%d ",arr[k]);
            }
    
	return 0;
}