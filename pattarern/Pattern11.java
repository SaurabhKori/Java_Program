package pattarern;

public class Pattern11 {
	public static void pattern11(int n) {
		char c='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(c+" ");
				c++;
			}
			c='A';
			System.out.println();
		}
	}

}
