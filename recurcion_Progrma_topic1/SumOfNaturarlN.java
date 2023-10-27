package recurcion_Progrma_topic1;

public class SumOfNaturarlN {
	static long sum=0;
	
	
	public void sumofnaturalN(int n) {
		
		if( n>0) {
			sum=sum+n;
			sumofnaturalN( n-1);
			
		}
		else {
			System.out.println("Sum of natural number"+sum);
		}
	}

}
