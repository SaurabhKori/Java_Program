// WAJP to check wheather a number ia a Disarium number or not.
//(Disarium Number: If the sum of its digit powered with their respective position is equal to the original number then it called a disarium number)
  import java.util.Scanner;
  class DisariumN{
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         int num2=num;
         int sum=0;
         int a=num;
         int x=0;
        while(a>0)
          {
            x++;
            a=a/10;
         }
         while(num2>0){
          int rem=num2%10;
          int pow=1;
        for(int i=1;i<=x;i++)
         {
             pow=pow*rem;
          }
        sum=sum+pow;
         num2=num2/10;
         x--;
        }
      if (sum==num){
 System.out.println(num+"=="+sum+"is a Disire Number");
       }
 else{
     System.out.println(num+"!="+sum+"is not a Disire Number");
        }
}
}   
         