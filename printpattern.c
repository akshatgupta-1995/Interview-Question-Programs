//Printing Pyramid with complexity less than O(n) 

#include <stdio.h>

int row=0,col=0,n=10;

void pattern(int n)
{
    if(row<=n)
    {
        if(col<row)
        {
            printf("*");
            col++;
            pattern(n);  
        }
      row++;
      col=0;
      printf("\n");
      pattern(n);
    }
}

int main()
{
    printf("Enter Sizs: ");
    scanf("%d",&n);
    pattern(n);
    return 0;
}
