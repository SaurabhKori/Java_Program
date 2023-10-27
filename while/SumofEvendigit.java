//WAJP to take input from user and print sum of all even digit number entered.
import java.util.Scanner;
 class SumofEvendigit
 {
  public static void main(String[] args)
     {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();
      int sum=0;
      int digit;
      while(num!=0)
        {
        digit=num%10;
         if(digit%2==0)
           {
           sum=sum+digit;
           }
        num=num/10;
        }
     System.out.println("Sum of all even digit  :"+sum);
    }
}
