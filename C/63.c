#include <stdio.h>
#include <math.h>
#include <time.h>

int main()
{
    int i,sum=0;
    for(i=1;i<=9;i++)
    {
        sum+=(int)(1.0/(1.0-log10(i)));
    }
    printf("%s %d\n","The total number of positive n-digit nth powers is:",sum);
    return 0;
}
