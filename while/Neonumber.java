// write take input from user and print neon number or not(Neon number:positive nuber whose sum of its square is equal to orginal number is called neon number)//
import java.util.Scanner;
 class Neonumber{
    public static void main(String[] args)
      {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int sum=0;
        int sq=num*num;
        while(sq>0){
          
          sum=sum+sq%10;
          sq=sq/10;
         }
        if(sum==num){
          System.out.println(num+"---Neon Number--"+sum);
           }
        else{   
            System.out.println(num+"--- is not Neon Number--"+sum);

           }
       
      }
}
       