import java.util.*;
 class Triangle{
      public static void main(String[] args)
          {
           Scanner sc=new Scanner(System.in);
           int a=sc.nextInt();
           int b=sc.nextInt();
           int c=sc.nextInt();
           String x=((a+b)>c && (b+c)>a && (a+c)>b)?"valid Tringle":"not valid Tringle";
           System.out.println(x);
           }
                  }
