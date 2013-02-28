#include <stdio.h>
#include <math.h>

int main()
{
    int i=2,k=1,x,lim,test;
    while(i<10001)
    {
        x=(6*k-1);
        lim=(int)sqrt((double)x);
        test=3;
        while(test<=lim)
        {
            if((x%test)==0)
            {
                break;
            }
            test+=2;
        }
        if(test>lim)
        {
            i++;
        }
        x+=2;
        lim=(int)sqrt((double)x);
        test=3;
        while(test<=lim)
        {
            if((x%test)==0)
            {
                break;
            }
            test+=2;
        }
        if(test>lim)
        {
            i++;
        }
        k++;
    }
    printf("%s %d\n","The 10001st prime is:",x);
    return 0;
}
