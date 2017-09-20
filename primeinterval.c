#include<stdio.h>
#include<conio.h>
void main()
{
    int n1,n2,i,s=0;
    scanf("%d %d",&n1,&n2);
    while(n1<n2)
    {
        for(i=2;i<=n1/2;i++)
        {
            s=0;
            if(n1%i==0)
            {
                s=1;
                break;
            }
        }
        if(s==0)
            printf("%d\n",n1);
        n1++;
    }
}
