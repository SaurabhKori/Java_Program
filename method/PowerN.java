//design the program with help of method for power of number;
import java.util.Scanner;
class PowerN
{
public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number");
 long num=sc.nextLong();
System.out.println("Enter the numeber of power");
  long pow=sc.nextLong();
 PowerN c=new PowerN();
 
 System.out.println(c.powerN(num,pow));
 }
public long powerN(long a,long b)
{
 long power=1;
 for(int i=1;i<=b;i++){
 power=power*a;
   }
 return power;
 }
}
 