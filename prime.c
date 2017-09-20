#include<stdio.h>
#include<conio.h>
void main()
{
    int n,i,c=0;
    scanf("%d",&n);
    for(i=2;i<n;i++)
    {
        if(n%i==0)
        {
            c++;
            break;
        }
    }
    if(c==0)
        printf("prime");
    else
        printf("not prime");
}
