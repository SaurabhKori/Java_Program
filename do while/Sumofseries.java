import java.util.Scanner;
class Sumofseries
{
	public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number:  ");
			int num=sc.nextInt();
                  System.out.println("Enter second no:");
                  int num1=sc.nextInt();
			int sum=0;
                  int i=1;
                  int a=0;
                  do{
                    a=a*10+num;
                    sum=sum+a;
                    i++;
                    }while(i<=num1);
                  System.out.println("Sum of series "+sum);
             }
}
		     

