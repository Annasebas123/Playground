#include<stdio.h>
int main()
{
  int size;
  scanf("%d",&size);
  int arr[size];
  
  for(int i=0;i<size;i++)
  {
    scanf("%d",&arr[i]);
  }
  
  for(int j=1;j<=size;j++)
  {
    int repeat=0;
    int k=0;
    for(int i=0;i<size;i++)
    {
      k=arr[i];
      if(j==k)
      {
        repeat=1;
        break;
      }
      
    }
    if(repeat==0)
    {
      printf("%d",j);
    }
    
  
  } 
  
  return 0;
}