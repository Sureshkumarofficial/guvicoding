#include<stdio.h>
#include<conio.h>
void main()
{
    int n,i,sum=0;
    printf("Enter the value of n");
    scanf("%d",&n);
    int a[n];
    printf("\nEnter the n numbers");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
        sum+=a[i];
    }
    printf("\nSum of n numbers: %d",sum);
}
