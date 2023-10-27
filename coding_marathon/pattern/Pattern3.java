package coding_marathon.pattern;

public class Pattern3 {
	public static void pattern3(int n ) {

		int star = 11;
		int space = 0;
		for(int i = 1; i<=n; i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			
			for(int j = 1; j<=star;j++) {
				
				System.out.print("*   ");
			}
			System.out.println();
			
			if(i<=n/2) {
			 star-=2;
			 space+=2;
			}else {
				space-=2;
				star+=2;
			}

			
	}

}}
