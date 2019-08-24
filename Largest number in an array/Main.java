#include<stdio.h>
int main()
{
  int arr_size;
  
  scanf("%d",&arr_size);
  
  int arr[arr_size];
  
  for(int idx=0;idx<=arr_size-1;idx++)
  {
    scanf("%d",&arr[idx]);
  }
  int large=arr[0];

  for(int idx=0;idx<=arr_size-1;idx++)
  {
    if(arr[idx]>large)
    {
      large=arr[idx];
    }
  }
  printf("%d",large);
  return 0;
}