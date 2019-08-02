#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  double a,b,c;
  scanf("%lf",&a);
  scanf("%lf",&b);
  c = hypot(a,b);
  printf("%.2lf\n",c);
  
  return 0;
}