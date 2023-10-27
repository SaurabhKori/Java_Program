//Take an input from user and print the digit of the number which is greater equal to five//
import java.util.Scanner;
class Digit2
{
   public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int c=num;
        int b;
        while(c!=0)
        {
         b=c%10;
         if(b>=5)
          {
           System.out.println("Digit is greater than 5 or Equal->"+b);
           }
          else{
           System.out.println("Digit is not greater Than 5 Or not Equal 5->"+b);
            }
          c=c/10;
           }
           }
           }
        