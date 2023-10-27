//WAJP to convert a binary numer into decimal number//
import java.util.Scanner;
class BinarytoDecimal{
     public static void main(String[] args)
        {
        
         Scanner sc=new Scanner(System.in);
          int bin=sc.nextInt();
           int num=bin;
             int digit,count=0,pow=1,sum=0;;
             while(num>0){
               digit=num%10;
                if(count==0){
                  pow=1; 
                      }     
               else{ for(int i=0;i<count;i++){
                  
                 pow=pow*2;
                 }}
                ;
                sum+=digit*pow; 
               num/=10;
                count++;
               pow=1;
               }
             System.out.println(bin+"convert into decimal"+sum);
           }
}
           