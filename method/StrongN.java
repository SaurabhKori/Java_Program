//Design a java program with help of method to check wheather a number is Strong number or not
import java.util.Scanner;
class StrongN
{
public static void main(String[] args)
 {
   System.out.println("Enter a number");
   Scanner sc=new Scanner(System.in);
   int num=sc.nextInt();
   StrongN c=new StrongN();
   c.strongN(num);
  }
 public void strongN(int num)
  {
    int a=1;
    int b=num;
    int rem=0;
    int fact=1;
    int fsum=0;
    while(num!=0){
     rem= num%10;
    for(a=1;a<=rem;a++){
      fact*=a;
      
      }
      fsum=fsum+fact;
      num/=10;
      fact=1;
     }
    if(fsum==b){
      System.out.println(b+"-->"+"Strong number---> "+fsum);
        }
     else{
       System.out.println(b+"-->"+" Not Strong number ---> "+fsum);
        }
   }
}