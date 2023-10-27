//WAJP to take input from user and print sum of factorial of each digits of the number.//
import java.util.Scanner;
class SumofFactorialdigit
{
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    int b=1;
    int fact=1;
    int digit;
    int sum=0;
    while(b<=num)
     {
     fact=fact*b;
     b++;
     }
   while(fact!=0)
    {
    digit=fact%10;
    sum=sum+digit;
    fact=fact/10;
    }
   System.out.println("sum of  factorial of digit  :"+sum);
   }
}