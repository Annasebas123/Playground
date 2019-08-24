#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);;
  int k;
  scanf("%d",&k);
  char str[1000];
  int i,j;
  for(int y=0;y<n;y++)
  {
    scanf("%d",&str[y]);
          }
  for(i=1;i<=k;i++)
  {
    int count=0;
    int q=0;
    for(j=0;j<n;j++)
    {
      q=str[j];
      if(i==q)
      {
        count++;
      }
    }
    printf("%d %d\n",i,count);
  }
  return 0;
}
  