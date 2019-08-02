#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d\n",&n);
  int Q=n%100;
  int s=Q/10;
  printf("%d\n",s);
  return 0;
}