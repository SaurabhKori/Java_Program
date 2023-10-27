package recurcion_Progrma_topic1;
//wajp to print number from 20 to 1 using recursion
public class Num20to1 {
	public static void num20to1(int n) {
		if(n>=1) {
		System.out.println(n);
		num20to1(n-1);
		}
	}

}
