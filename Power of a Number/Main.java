#include <stdio.h>
int main()
{  
  int base,expo,i,ans=1;
  scanf("%d",&base);
  scanf("%d",&expo);
  if(expo>=0)
  {
    for(i=1;i<=expo;i++)
    {
      ans = ans*base;
    }
    printf("%d\n",ans);
  }
  else
  {
    printf("Wrong input");
  }
    return 0;
}