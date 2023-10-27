//Write a java program to take in input and print how many factor are of that number (number it self is not included).//
import java.util.Scanner;
class CountFactor
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int a=sc.nextInt();
  int b=1;
  int count=0;
  while(b<a)
  {
   if(a%b==0)
    {
      count=b/b+count;
    }
   b++;
   }
  System.out.println("Count of Factor :"+count);
  }
}