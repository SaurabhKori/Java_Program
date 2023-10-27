//WAJP to take a user input and print factorial of each digits of the number//
import java.util.Scanner;
class FactorialofDigit
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a nuber");
   int num=sc.nextInt();
   int b=1;
   int fact=1;
   int digit;
   
  
   while(b<=num)
      {
      fact=fact*b;
      b++;
      }

      while(fact!=0)
       { 
         digit=fact%10;
         fact=fact/10;
         System.out.println("factorial of each digit"+digit);
        
       }
   }
}