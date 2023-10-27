//design the method factor of number;
import java.util.Scanner;
class FactorofNum
{
public static void main(String[] args)
{
System.out.println("Enter a number");
 Scanner sc=new Scanner(System.in);
 int num=sc.nextInt();
 FactorofNum c=new FactorofNum();
  c.factorofNum(num);
 }
 public void factorofNum( int num1){
   int b=1;
   int a=0;
   while(b<=num1/2)
   {
    if(num1%b==0)
     {
       
    System.out.println(b);
     }
      
      b++;
     }
   
   }
 }