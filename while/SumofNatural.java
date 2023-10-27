//Write a java program to print sum of all the natural number up to 100//
import java.util.Scanner;
 class SumofNatural
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int num=sc.nextInt();
   int i=1;
   int sum=0;
   while(i<=num)
      {
       sum=sum+i;
      i++;
      }
     System.out.println("sum of natural number  :"+sum);
     }
}
        