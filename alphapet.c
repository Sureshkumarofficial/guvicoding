#include<stdio.h>
#include<conio.h>
void main()
{
    char s;
    scanf("%c",&s);
    if((s>='a'&&s<='z')||(s>='A'&&s<='Z'))
        printf("alphapet");
    else
        printf("not alpha");
}
