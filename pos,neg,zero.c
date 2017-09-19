#include<stdio.h>
#include<conio.h>
void main()
{
    int i;
    scanf("%d",&i);
    if(i>0&&i!=0)
        printf("positive");
    else if(i<0&&i!=0)
        printf("negative");
    else
        printf("Zero");
}
