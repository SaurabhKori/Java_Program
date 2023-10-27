import java.util.Scanner;
class BinarytoDecimal2{
     public static void main(String[] args)
        {
        
         Scanner sc=new Scanner(System.in);
          int bin=sc.nextInt();
           int num=bin,a=0,decimal=0,base=1;
             while(num>0){
                 a=num%10;
                 decimal+=a*base;
                  base*=2;
                  num/=10;
                 }
           System.out.println(bin+"....binary convert to decimal"+decimal);
       }
}