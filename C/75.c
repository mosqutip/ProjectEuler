#include <stdio.h>
#include <math.h>
#define LIMIT 1500000

int main()
{
    int m,n,a,b,c,p;
    int sums[LIMIT+1]={};
    for(m=2;m<sqrt(LIMIT/2);m++)
    {
        for(n=1;n<m;n++)
        {
            if((((m-n)&1)==1)&&(gcd(m,n)==1))
            {
                a=((m*m)-(n*n));
                b=(2*m*n);
                c=((m*m)+(n*n));
                p=(a+b+c);
                while(p<=LIMIT)
                {
                    sums[p]++;
                    p+=(a+b+c);
                }
            }
        }
    }
    int i,sum=0;
    for(i=0;i<LIMIT;i++)
    {
        if(sums[i]==1)
        {
            sum++;
        }
    }
    printf("The number of unique Pythagorean sums under 1500000 is: %d\n",sum);
    return 0;
}

int gcd(int a,int b)
{
    int c;
    while(b!=0)
    {
        c=b;
        b=(a%c);
        a=c;
    }
    return a;
}
