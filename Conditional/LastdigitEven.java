import java.util.Scanner;
class lastdigitEven{
     public static void main(String[] args)
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        String x=((num%10)%2==0)?"Last digit is Even":"Last digit Odd";
        System.out.println(x);
        }          
                   }    
        