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
  int count=0;
  int compare=0;
  int s=0;
   for(int i = 0; i < 1; i++)
    {
        for(int j = 0; j < c1; j++)
        {
          if(a[i][j]!=0)
          {
  count=1;
            }
        }
   }
   for(int i = 0; i < r1; i++)
    {
        for(int j =c1-1; j < c1; j++)
        {
          if(a[i][j]!=0)
          {
  compare=1;
          }
        }
   }
   for(int i = 0; i < r1; i++)
    {
        for(int j =0; j < c1; j++)
        {
           if((a[i][j]!=0)&&(i==j))
           {
             s=1;
           }
        }
   }
  if((count==r1)||(compare==r1)||(s==1))
  {
    for(int i = 0; i < r1; i++)
    {
        for(int j =0; j < c1; j++)
        {
          if(i==j)
          {
            printf("%d ",a[i][j]);
          }
            
        }
    }
  }
  if((count==r1)||(compare==r1)||(s==1))
  {
    for(int i = 0; i < r1; i++)
    {
        for(int j =0; j < c1; j++)
        {
          if(j==i+1)
          {
            printf("%d ",a[i][j]);
          }
            
        }
    }
  }
   if((count==r1)||(compare==r1)||(s==1))
  {
    for(int i = 0; i < r1; i++)
    {
        for(int j =0; j < c1; j++)
        {
          if(j==i+2)
          {
            printf("%d ",a[i][j]);
          }
            
        }
    }
  }
	return 0;
}