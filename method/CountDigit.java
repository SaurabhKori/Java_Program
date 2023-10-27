//Design a method to count the number of digit in a number.
import java.util.Scanner;
class CountDigit
{
 public long countdigit( long num1){
      long count=0;
      while(num1!=0)
      {
       count++;
       num1/=10;
      }
      return count;
     }
  public static void main(String[] args)
  {
   System.out.println("Enter a number");
   Scanner sc=new Scanner(System.in);
   long num=sc.nextLong();
   CountDigit c=new CountDigit();
 System.out.println(  c.countdigit(num));
     }
 }