import java.util.Scanner;
class LCM
{
	public static void main(String[] args)
		{
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter a first number");
             int num=sc.nextInt();
		 System.out.println("Enter a second number");
             int num2=sc.nextInt();
		 System.out.println("Enter Third number");
             int num3=sc.nextInt();
             int i;
             for(i=1;;i++)
             {
             if(i%num==0 && i%num2==0 && i%num3==0)
               {
                break;
               }
             }
           System.out.println(" Lcm of three number"+i);
}

}
 