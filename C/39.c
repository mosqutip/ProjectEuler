#include <stdio.h>
#include <math.h>
#define LIMIT 1000

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
    int i,j,max=0;
    for(i=0;i<LIMIT;i++)
    {
        if(sums[i]>=max)
        {
            max=sums[i];
            j=i;
        }
    }
    printf("%s %d\n","The most common Pythagorean triple sum under 1000 is:",j);
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
