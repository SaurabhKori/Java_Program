//WAJP to convert to decimal number into binary number
 import java.util.Scanner;
 class DecimaltoBinar
 {
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Decimal Number");
      int dec=sc.nextInt();
      int num=dec;
      int base=1,bin=0,rem;
      while(num>0)
       {
         rem=num%2;
         bin=bin+rem*base;
         base*=10;
         num/=2;
         
        
        }
      
      System.out.println(dec+"---decimal convert to binary--"+bin);
}
}
           