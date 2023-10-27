//wajp to take an input from user and print sum of all the factors of the number entered(Number itself not included)//
import java.util.Scanner;
class SumofallFactor
{
public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number ");
   int num=sc.nextInt();
   int b=1;
   int sum=0;
   while(b<=num/2)
    {
     if(num%b==0)
     {
      
     sum=sum+b;
      }
    b++;
   }
   System.out.println("Factor of Sum   :"+sum);
 }
}
       
