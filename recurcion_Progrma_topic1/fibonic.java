package recurcion_Progrma_topic1;
import java.util.Scanner;

public class fibonic {
	public static int fib(int n) {
		 if (n == 0) {
		      return 0;
		    } // Oth fibonacci is 0

		    if (n == 1 || n == 2) {
		      return 1;
		    } // 1st and 2nd Fibonacci are 1 and 1 only

		    // calling function recursively for nth Fibonacci
		    return fib(n - 1) +fib(n - 2);
		  }
	public static void count(int m) {
		if(m>=0) {
			System.out.print(fib(m));
			count(m-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<=10;i++) {
			System.out.print(fib(i)+" ");
		}
		count(a);
	}
      
	}


