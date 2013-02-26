#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int i,j,sum,max=0,imax,jmax;
    for(i=999;i>=100;i--)
    {
        for(j=999;j>=100;j--)
        {
            sum=i*j;
            if (isPalindrome(sum)&&(sum>max))
            {
                max=sum;
                imax=i;
                jmax=j;
            }
        }
    }
    printf("%s %d\n","The largest palindromic number that is"
           " the product of two three digit numbers is:",max);
    return 0;
}

int isPalindrome(int n)
{
    int i,j;
    char buffer[7];
    sprintf(buffer,"%d",n);
    for(i=0,(j=strlen(buffer)-1);i<(strlen(buffer)/2);i++,j--)
    {
        if(buffer[i]!=buffer[j])
            return 0;
    }
    return 1;
}
