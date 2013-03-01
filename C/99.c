#include <stdio.h>
#include <math.h>

int main()
{
    int base,exp,i=1,j,max=0;
    double x;
    FILE *fp;
    if((fp=fopen("files/base_exp.txt","r"))==NULL)
    {
        printf("File missing!\n");
    }
    while(fscanf(fp,"%d,%d",&base,&exp)==2)
    {
        x=(exp*log10(base));
        if (x>max)
        {
            max=x;
            j=i;
        }
        i++;
    }
    fclose(fp);
    printf("%s %d\n","The maximum base/exponent pair is on line:",j);
}
