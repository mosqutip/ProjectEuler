#include <stdio.h>
#include <math.h>
#define NUMPRIMES 100
#define LIMIT 1000000

int main()
{
    int i,j,lim;
    lim=sqrt(NUMPRIMES);
    int primeArr[(NUMPRIMES)]={};
    primeArr[0]=2;
    primeArr[1]=3;
    for(i=2;i<lim;i++)
    {
        j=i*i;
        while(j<NUMPRIMES)
        {
            primeArr[j-2]=-1;
            j+=i;
        }
    }
    int max=1,test=1;
    for(i=0;i<NUMPRIMES;i++)
    {
        if(primeArr[i]!=-1)
        {
            test*=(i+2);
            if(test<=LIMIT)
            {
                max=test;
            }
            else
            {
                break;
            }
        }
    }
    printf("%s %d\n","The maximum Totient ratio under 1000000 is at:",max);
    return 0;
}
