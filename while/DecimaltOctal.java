//WAJP to convert to decimal number into octal number
 import java.util.Scanner;
 class DecimaltOctal
 {
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Decimal Number");
      int dec=sc.nextInt();
      int num=dec;
      int base=1,octal=0,rem;
      while(num>0)
       {
         rem=num%8;
         octal=octal+rem*base;
         base*=10;
         num/=8;
        
        }
      
      System.out.println(dec+"---decimal convert to Octal--"+octal);
}
}
           