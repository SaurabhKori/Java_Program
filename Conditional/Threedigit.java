import java.util.*;
   class Threedigit{
       public static void main(String[] args)
            {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter a number");
             int num=sc.nextInt();
             String x=(num>=100 && num<=999)?"number is three digit":"number is not three digit";
             System.out.println(x);
             }
               }
         