package recurcion_Progrma_topic1;
// wajp to print power of a to b by using recursion
public class Power {
	static int pow=1;
	public static int power(int a,int b) {
		if(b>0) {
			pow=pow*a;
			power(a,b-1);
		}
		return pow;
	}

}
