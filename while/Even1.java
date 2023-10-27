//Take a input from user and print how many digit in this number is even
import java.util.Scanner;
class Even1
{
 public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    long num=sc.nextLong();
    long b=num;
    long count=0; 
    long c;
    while(b!=0)
      {
       c=b%10;
       
       if(c%2==0)
        {
        count++;
         }
         
            
       b=b/10;
       }
          System.out.println("In this digit is total even number---->"+count);
          
       }
}