//Take from input from user and print How many digit are in that number//

import java.util.Scanner;
class Countdigit
{  
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     int num=sc.nextInt();
     int c=num;
     int b;
     int count=0;
     while(c!=0)
     {
      b=c%10;
      count=b/b+count;
      c=c/10;
      }
     System.out.println("Total digit of this number->"+count);
    }
}