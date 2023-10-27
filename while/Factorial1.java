// Take input from user and print factorial of that number
import java.util.Scanner;
class Factorial1
{
 public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    int a=1;
   
    int fact=1;
    if(num==0 || num==1)
     {
     System.out.println("Factorial of 0 and 1 is a ::--->: 1");
      }
else{
     while(a<=num)
   {
    fact=fact*a;
     a++;
    }
}
  System.out.println("factorial of "+num+"--->"+fact);
    
    }
}
