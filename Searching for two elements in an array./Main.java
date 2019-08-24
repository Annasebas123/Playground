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
 int search_element1;
scanf("%d",&search_element1);
int search_element2;
scanf("%d",&search_element2);
  int f1=0,f2=0;
  for(int idx=0;idx<=arr_size-1;idx++)
  {
     if(search_element1==arr[idx])
     {
       printf("%d",idx);
       f1=1;
    }
    if(search_element2==arr[idx])
    {
      printf("\n%d",idx);
      f2=1;
    }
  }
if(f1==0)
{
  printf("-1");
}
    if(f2==0)
    {
      printf("\n-1");
    }
   
  return 0;
}