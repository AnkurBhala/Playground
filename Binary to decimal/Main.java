#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  int num,sum=0,i=0,rem;
  scanf("%d",&num);
  while(num!=0)
  {
    rem = num%10;
    sum = sum+rem*pow(2,i);
    num = num/10;
    i++;
  }
  printf("%d",sum);
  return 0;
}