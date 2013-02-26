#include <stdio.h>

int main()
{
    long limit=600851475143;
    int divisor=2;
    while(limit>1)
    {
        if(limit%divisor==0)
        {
            limit/=divisor;
        }
        else
        {
            divisor++;
        }
    }
    printf("%s %d\n","The largest prime divisor of 600851475143 is:",divisor);
    return 0;
}
