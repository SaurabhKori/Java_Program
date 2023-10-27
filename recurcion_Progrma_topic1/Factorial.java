package recurcion_Progrma_topic1;
//WAJP to print factorial of a number using recursion
public class Factorial {
	static int fact=1;
	public static void factorial(int n) {
		if(n>0) {
			fact=fact*n;
			factorial(n-1);
		}
		else {
			System.out.println("Factorial is-- "+fact);
		}
		
	}

}
