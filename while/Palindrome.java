//write a java program to take user input and print whether the entered number is palindrome number or not.//
import java.util.Scanner;
class Palindrome
{
 public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int num=sc.nextInt();
   int num2=num;
   int reverse=0;
   int rem;
   while(num!=0)
    {
    rem=num%10;
    reverse=reverse*10+rem;
    num=num/10;
    }
   if(reverse==num2)
     {
     System.out.println(num2+":  is palindrome number");
      }
     else
      {
      System.out.println(num2+":  is not palindrome number");
       }
}
}
