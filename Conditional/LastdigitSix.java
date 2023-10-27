import java.util.Scanner;
   class LastdigitSix{
       public static void main(String[] args)
          {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int number=sc.nextInt();
            String x=(number%100==66)?"Last digit Is 66":"last digit is not 66";
            System.out.println(x);
          }
                     }