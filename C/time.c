#include <time.h>
#include <stdio.h>

int main()
{
    clock_t start = clock(), total;
    total=clock()-start;
    int msec=total*1000/CLOCKS_PER_SEC;
    printf("%s %d %s\n","Total time:",msec,"milliseconds");
}
