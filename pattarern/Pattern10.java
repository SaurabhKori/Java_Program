package pattarern;

public class Pattern10 {
	public static void pattern10(int n) {
		char c='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(c+" ");
			}
			c++;
			System.out.println();
		}
	}

}
