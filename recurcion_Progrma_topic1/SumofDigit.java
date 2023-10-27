package recurcion_Progrma_topic1;
//wajp to print the sum of digit of a number by using recursion
public class SumofDigit {
	static int sum=0;
	public static void sumofdigit(int n) {
		if(n>0) {
			sum=sum+n%10;
			sumofdigit(n/10);
		}
		else {
			System.out.println("Sum of digit a number-- "+sum);
		}
	}

}
