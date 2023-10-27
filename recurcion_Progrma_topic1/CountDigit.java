package recurcion_Progrma_topic1;
//wajp to count and print number of digit in a number by using recursion
public class CountDigit {
	static int count=0;
	public static void countdigit(int n) {
		if(n>0) {
			count++;
			countdigit(n/10);
		}
		else {
			System.out.println("Total digit is---"+count);
		}
	}

}
