//WAJP to take a input and print Reverse of the number.//
import java.util.Scanner;
class Reverse
{
 public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int num=sc.nextInt();
   int reverse=0;
   int rem;
   while(num!=0)
    {
    rem=num%10;
    reverse=reverse*10+rem;
    num=num/10;
    }
   System.out.println(reverse+": is reverse number ");
}
}