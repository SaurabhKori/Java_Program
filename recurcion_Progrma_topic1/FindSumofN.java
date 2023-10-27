package recurcion_Progrma_topic1;

public class FindSumofN {
	static int i=0;
	public int findsum(int n) {
		
		if(i<n) {
			i++;
			return i+findsum(n);
		}
		else {
			return 0;
		}
	}

}
