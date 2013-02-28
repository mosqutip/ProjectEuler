#include <stdio.h>
#define LIMIT 1000

int main()
{
    int m,n,a,b,c,p1,p2,k;
    int sums[LIMIT]={};
    for(m=2;m<22;m++)
    {
        for(n=1;n<m;n++)
        {
            a=((m*m)-(n*n));
            b=(2*m*n);
            c=((m*m)+(n*n));
            p1=(a+b+c);
            if(p1>LIMIT)
            {
                break;
            }
            sums[p1]++;
            if((((m-n)%2)!=0)&&(gcd(m,n)==1))
            {
                p2=(p1+p1);
                while(p2<=LIMIT)
                {
                    sums[p2]++;
                    p2+=p1;
                }
            }
        }
    }
    int i,j,max=0;
    for(m=i;i<=LIMIT;i++)
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
