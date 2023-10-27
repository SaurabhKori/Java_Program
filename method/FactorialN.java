//design a method factorial a number
import java.util.Scanner;

class FactorialN
{
public static void main(String[] args)
 {
 System.out.println("Enter a number");
 Scanner sc=new Scanner(System.in);
 long num=sc.nextLong();
 FactorialN c=new FactorialN();
 c.factorialN(num);
 }
 public void factorialN(long num){
  long a=1;
  
  long fact=1;
  if(num==0||num==1)
 {
  System.out.println("Factorial is 1");
  }
 else{
 while(a<=num)
   {
    fact=fact*a;
    a++;
    }
    System.out.println(num+" --->"+"Factorial is a --> "+ fact);
   }
  }
}

