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
    for(int i = r1-1; i>=0; i--)
    {
        for(int j = 0; j < c1; j++)
        {
          printf("%d ",a[j][i]);
        }
      printf("\n");
    }
	return 0;
}