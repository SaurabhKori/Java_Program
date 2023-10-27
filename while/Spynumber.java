//WAJP to take a user input n and print wheather the number is a Spy number or not.
//(Spy Number:A positive integer number is called a spy number if the product of its digits are equal
import java.util.Scanner;
class Spynumber{
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         int num=sc.nextInt();
         int s=num;
         int p=num;
         int sum=0;
         int pro=1;
         int rem;
         while(s>0){
         rem=s%10;
         sum=sum+rem;
          s=s/10;
         }
         while(p>0){
         rem=p%10;
         pro=pro*rem;
         p=p/10;
         }
        if(sum==pro){
         System.out.println(sum+"=="+pro+" ----"+num+" =>is Spy number");
          }
        else{
            System.out.println(sum+"!="+pro+" ----"+num+" =>is not Spy number");
         }
      }
}