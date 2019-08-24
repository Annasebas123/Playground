#include<stdio.h>
int main()
{
	int r1;
    int c1;
    scanf("%d", &r1);
    scanf("%d", &c1);
    int a[r1][c1];
    
    for(int i = 0; i < r1; i++)
    {
        for(int j = 0; j < c1; j++)
        {
            scanf("%d", &a[i][j]);
        }
    }
   
    int b[r1][c1];
    
    for(int i = 0; i < r1; i++)
    {
        for(int j = 0; j < c1; j++)
        {
            scanf("%d", &b[i][j]);
        }
    }
  int count=0;
for(int i=0;i<r1;i++)
{
  for(int j=0;j<c1;j++)
      {
    if(a[i][j]==b[i][j])
    {
      count++;
    }
  }
}
  if(count==r1*c1)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
	return 0;
}