package recurcion_Progrma_topic1;
//WAJP to print fibonacci series by using recursion
public class FibonacciSeries {
	static int a=0;
	static int b=1;
	static int c;
	public static void fibonacciseries(int n) {
		if(n>0) {
			if(a==0&&b==1) {
System.out.print(a+" "+b);
			    
				a=b;
				b=a;

				
			}
			else if(n==9) {
				System.out.print(" "+1);
			}
			else {
				c=a+b;
				b=a;
				a=c;
				System.out.print(" "+c);

			}
			fibonacciseries(n-1);
			
		}
		
	}

}
