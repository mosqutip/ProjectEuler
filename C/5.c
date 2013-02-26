#include <stdio.h>
#include <limits.h>

int main()
{
    int cur=40,test=19;
    while(cur<INT_MAX)
    {
        for(test;test>=10;test--)
        {
            if ((cur%test)!=0)
            {
                break;
            }
            if (test==10)
            {
                printf("%d %s\n",cur,"is divisible by 1 through 20");
                return 0;
            }
        }
        cur+=20;
        test=19;
    }
    printf("%s\n","No such number exists in the int limit");
    return 0;
}
