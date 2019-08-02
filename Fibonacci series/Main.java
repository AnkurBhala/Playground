#include<stdio.h>
int main()
{
  //Type your code here
  int n,a,b,next,i;
  scanf("%d",&n);
  a = 0;
  b = 1;
  next = 0;
  for(i=1;i<=n;i++)
  {
    printf("%d ",next);
    
    a = b;
    b = next;
    next = a+b;
    
    
  }
 
  return 0;
}