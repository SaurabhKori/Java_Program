//WAJP to convert a octal number into decimal number
import java.util.Scanner;
class OctaltoDecimal{
     public static void main(String[] args)
        {
        
         Scanner sc=new Scanner(System.in);
          int octal=sc.nextInt();
           int num=octal,a=0,decimal=0,base=1;
             while(num>0){
                 a=num%10;
                 decimal+=a*base;
                  base*=8;
                  num/=10;
                 }
           System.out.println(octal+"....octal convert to decimal-->"+decimal);
       }
}