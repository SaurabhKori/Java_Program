//Design a method to reverse a number.
import java.util.Scanner;
class ReverseN
{
public static void main(String[] args)
 {
  System.out.println("Enter a number");
  Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  ReverseN r=new ReverseN();
  System.out.println(r.reversenum(num));
  }
  public int reversenum(int num1){
    int rev=0;
    int rem=0;
    while(num1!=0)
     {
      rem=num1%10;
      rev=rev*10+rem;
      num1/=10;
      }
     return rev;
     }
  }
