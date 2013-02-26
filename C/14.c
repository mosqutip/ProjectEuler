#include <stdio.h>
#include <time.h>

int main()
{
    int i,lChain=0,li=0,chain;
    unsigned int j;
    int chains[1000000]={};
    i=1;
    chains[1]=1;
    while(i<1000000)
    {
        if(chains[i]>lChain)
        {
            lChain=chains[i];
            li=i;
        }
        i++;
        j=i;
        chain=1;
        while(j!=1)
        {
            if(j&1)
            {
                j+=((j<<1)+1);
            }
            else
            {
                j>>=1;
                if(j<i)
                {
                    chains[i]=(chain+chains[j]);
                    break;
                }
            }
            chain++;
        }
    }
    printf("%s %d\n","The longest Collatz chain under 1000000 starts at:",li);
    return 0;
}
