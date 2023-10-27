import java.util.Scanner;
   class Even_odd
       {
        public static void main(String[] args)
            {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           String x=(n%2==0)?"This is even No"+n:"This is odd"+n;
           System.out.println(x);
            }
          }