#include <stdio.h>

int main()
{
    int sumOfSquares=1,squareOfSums=1;
    int i;
    for(i=2;i<=100;i++)
    {
        sumOfSquares+=(i*i);
        squareOfSums+=i;
    }
    squareOfSums*=squareOfSums;
    printf("%s %d\n","The difference between the sum of squares and" 
           " the square of the sum is:",(squareOfSums-sumOfSquares));
    return 0;
}
