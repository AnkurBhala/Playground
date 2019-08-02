#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d\n",&n);
 int Q=n/10;
  int R=n%10;
  int sum=Q+R;
  printf("%d\n",sum);
  return 0;
}