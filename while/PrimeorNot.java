//Take a input from user and print prime number or not//
import java.util.Scanner;
class PrimeorNot
{
  public static void main(String[] args)
     {
      Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
      int num=sc.nextInt();
      int b=2;
      int count=0;
     while(b<num/2)
         {
          if(num%b==0)
           {
            count++;
            }
         b++;
        }
       if(count==0)
        {
         System.out.println(num+" is prime  number");
         }
       else{
           System.out.println(num+"is not prime number");
          }
          }
  }