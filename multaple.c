#include<stdio.h>
#include<conio.h>
void main()
{
    int n,i;
    scanf("%d",&n);
    for(i=1;i<=10;i++)
    {
        printf("%d * %d = %d\n",i,n,n*i);
    }
}
