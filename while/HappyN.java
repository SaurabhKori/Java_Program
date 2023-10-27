// WAJP check is wheather a number is a happy number or not (A happy number is a number that yield 1 subsituded by the sum of digit squared repeatedly);
import java.util.Scanner;
class HappyN{
     public static void main(String[] args)
     {
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int num2=num;
        int rem;
        int sq;
        do{
        while(num2>0){
          rem=num2%10;
          sq=rem*rem;
           sum=sum+sq;
          num2=num2/10;
           
            }
          
               num2=sum;
               sum=0;
         
             

           }while(num2!=1 && num2!=4 && num2!=0);
          if(num2==1){
              System.out.println(num+"happy number"+num2);
               }
             else if(num2==4 || num2==0){
               System.out.println(num+" is nothappy number"+num2);
           }
          
              
          }
   }
            
        
           
          
           