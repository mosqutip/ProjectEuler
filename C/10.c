#include <stdio.h>
#include <math.h>
#define LIMIT 2000000

int main()
{
    int i,j,lim;
    lim=sqrt(LIMIT);
    int primeArr[(LIMIT)]={};
    primeArr[0]=2;
    primeArr[1]=3;
    for(i=2;i<lim;i++)
    {
        j=i*i;
        while(j<LIMIT)
        {
            primeArr[j-2]=-1;
            j+=i;
        }
    }
    long sum=0;
    for(i=2;i<LIMIT;i++)
    {
        if(primeArr[i]!=-1)
        {
            sum+=(i+2);
        }
    }
    printf("%s %ld\n","The sum of prime numbers less than two million is:",sum);
    return 0;
}
