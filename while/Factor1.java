//write a java program to take input from user and print all the factor of the number.(number it self is not included)//
import java.util.Scanner;
class Factor1
{
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sc.nextInt();
    int b=1;
   while(b<a)
    {
       if(a%b==0)
         {
          
          System.out.println("Factor of a :"+b);
          
         }
        b++;
       }
    }
}