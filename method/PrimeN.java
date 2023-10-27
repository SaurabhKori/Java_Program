//design a method to check wheather a number prime number or not;
import java.util.Scanner;
class PrimeN
{
public static void main(String[] args)
 {
  System.out.println("Enter a number ");
 Scanner sc=new Scanner(System.in);
 int num=sc.nextInt();
 PrimeN c=new PrimeN();
  c.primeN(num);
 }
 public void primeN(int num){
   
   int count=0;
   for(int b=2;b<=num/2;b++){
     if(num%b==0){
      count++;
        }
      }
    if(count==0){
     System.out.println(num+"-->" +"This number is prime number");
        }
     else{
      System.out.println(num+"-->"+"this number is not prime number");
        }
   
 }
  }