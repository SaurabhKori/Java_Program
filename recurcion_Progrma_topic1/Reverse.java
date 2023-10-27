package recurcion_Progrma_topic1;
//Wajp to reverse a number using recursion
public class Reverse {
	static int rev=0;
	public static void reverse(int n) {
		if(n!=0) {
		rev=rev*10+n%10;
		reverse(n/10);
		}
		else {
			System.out.println(" ---Reverse number is -- "+rev);
		}
	}

}
