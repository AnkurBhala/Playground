#include <stdio.h>

int main()
{
    int i, n;
    
    /* Input upper limit from user */
   
    scanf("%d", &n);

   

    /* Start loop from 1 and increment it by 1 */
    for(i=1; i<=n; i++)
    {
        /* If 'i' is odd then print it */
        if(i%2!=0)
        {
            printf("%d\n", i);
        }
    }

    return 0;
}