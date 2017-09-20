#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
    int n,ori,s,p=0,res=0,rem=0;
    scanf("%d",&n);
    ori=n;
    while(ori!=0)
    {
        ori=ori/10;
        p++;
    }
    ori=n;
    while(n!=0)
    {
        rem=n%10;
        res=res+pow(rem,p);
        n=n/10;
    }
    if(ori==res)
        printf("armstrong");
    else
        printf("not armstrong");
}
