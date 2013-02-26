#include <stdio.h>

int main()
{
    int f1=0,f2=0,cur=1,sum=0;
    while (cur<=4000000)
    {
        f1=f2;
        f2=cur;
        cur=f1+f2;

        if (cur%2==0)
        {
            sum+=cur;
        }
    }
    printf("%s %d\n","The sum of even Fibonacci"
           " numbers less than 4 million is:",sum);
    return sum;
}
