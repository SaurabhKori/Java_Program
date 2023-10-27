//Take for input from user and print wheater the given number is prime or not//
import java.util.Scanner;
class PrimeorNot
{   
   public static void main(String[] args)
      {
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         int b=1;
         while(b<=num)
              {
                 if(b%2==0 || b%2!=0)
                 {
                  System.out.println(b);
                  }
                 b++;
                }
        }
}
          