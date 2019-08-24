// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int arr_size;
  scanf("%d",&arr_size);
  int arr[arr_size];
  for(int idx=0;idx<=arr_size-1;idx++)
  {
    scanf("%d",&arr[idx]);
  }
  int large;
  large=arr[0];
for(int idx=1;idx<=arr_size-1;idx++)
  {
    if(arr[idx]>large)
    {
      large=arr[idx];
    }
}
     for(int idx=1;idx<=arr_size-1;idx++)
     {
       if(arr[idx]==large)
       {
         printf("%d",idx);
       }
     }
  return 0;
}