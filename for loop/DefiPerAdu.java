// WAJP to check wheather a number is Deficient number ,Perfect or Adundant number //
import java.util.Scanner;
class DefiPerAdu{
    public static void main(String[] args)
       {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=num;
        int sum=0;
        int i;
        for(i=1;i<=num1/2;i++)
           {
            if(num%i==0)
             {
               sum=sum+i;
              }
             }
             if(sum==num){
               System.out.println("sum-->"+sum+" = num-->"+num+" is perfect number");
               }
             else if(sum<num)
                  {
                    System.out.println("sum--->"+sum+" < num---> "+num+" is Deficient number");
                   }
              else if(sum>num){
                   System.out.println("sum-->"+sum+" > num-->"+num+" is Adundant number");
                   }
          }
}