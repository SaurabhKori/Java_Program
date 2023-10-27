//WAJP to take a user input and print the entered number is a strong number or not.(Strong number: if the sum of factorial of each digit of a number is equal to numbers itself)//
import java.util.Scanner;
class Strongnumber
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
   if(sum==num)
     {
     System.out.println(num+"  : is strongest number");
     }
    else
     {
      System.out.println(num+"  : is not strongest number");
     }
}
}