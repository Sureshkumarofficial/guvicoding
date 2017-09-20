#include<stdio.h>
#include<conio.h>
void main()
{
    int n,ori,res=0,i;
    scanf("%d",&n);
    ori=n;
    while(n!=0)
    {
        i=n%10;
        res=res*10+i;
        n=n/10;
    }
    if(ori==res)
        printf("palindrome");
    else
        printf("not palindrome");
    return 0;
}
