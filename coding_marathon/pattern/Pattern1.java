package coding_marathon.pattern;

public class Pattern1 {
	public static void pattern1(int n) {
		char c='A';
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(i+j<=n) {
					System.out.print("  ");
				}else {
					System.out.print(c+"   ");
				}
			}
			c++;
			System.out.println();
		}
		
		
	}

}
