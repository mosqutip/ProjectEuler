#include <stdio.h>
#include <math.h>

int main()
{
    int m=2,n,a,b,c;
    while(m<sqrt(1000))
    {
        for(n=1;n<m;n++)
        {
            a=(2*m*n);
            b=((m*m)-(n*n));
            c=((m*m)+(n*n));
            if((a+b+c)==1000)
            {
                printf("%s %d\n","The product of the Pythagorean triple whose "
                       "sum is 1000 is:", (a*b*c));
                return 0;
            }
        }
        m++;
    }
    printf("%s\n", "No Pythagorean triple found.");
    return 1;
}
