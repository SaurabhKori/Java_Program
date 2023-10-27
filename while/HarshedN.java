//WAJP to check wheather a given number is a Harshad number or not.//
import java.util.Scanner;
class HarshedN{
     public static void main(String[] args)
      {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int num1=num;
       int sum=0;
       int rem;
       while(num1>0)
       {
        rem=num1%10;
        sum=sum+rem;
        num1=num1/10;
        }
        if(num%sum==0){
         System.out.println(num+"--is a harshed number");
           }
        else{
           System.out.println(num+"---is not harshed number");
             }
          }
}
       
           
      

          
 