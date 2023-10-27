// WAJP to check wheather a number is Automorphic number or not
import java.util.Scanner;
class AutomorphicNumber
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int num=sc.nextInt();
   int num2=num;
   int rem=0 ,count=0,lastnum=0,rev=1;
   int sq=num*num;
    while(num2>0){
         rem=num2%10;
          count++;
         num2/=10;
       }
      for(int i=count;i>0;i--){
           rev=rev*10;
           }
          int res=sq%rev;
        if(num==res){
           System.out.println(num+"=="+res+"---This is Automorphic number");
            }
         else{
             System.out.println(num+"!="+res+"---This is not Automorphic number");
            }
      }
}
           