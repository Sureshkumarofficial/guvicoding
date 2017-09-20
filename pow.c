#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
    int n,p,s;
    printf("Enter the number and power: \n");
    scanf("%d %d",&n,&p);
    s=pow(n,p);
    printf("%d power of %d is %d",n,p,s);
}
