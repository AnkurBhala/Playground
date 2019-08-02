#include <stdio.h>
void main()
{
    long int i, fact = 1, num;
  	scanf("%ld", &num);
    if (num <= 0)
    {
        fact = 1;
    }
    else
    {
        for (i = num; i >=1; i--)
        {
            fact = fact * i;
        }
    }
    printf("%ld\n",fact);
}
