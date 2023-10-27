//Take two number from user and print power of that number.
import java.util.Scanner;
class PowerofNum
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a two number");
 int num=sc.nextInt();
 int power=sc.nextInt();
 int countofp=1;
 int i=1;
 while(i<=power)
    {
    countofp=countofp*num;
    i++;
   }
 System.out.println(num+"count of power"+countofp);
 }
}
      