package pattarern.soastic;

public class Pattern9 {
	public static void pattern9(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1&&j>n/2+1||i==n&&j<n/2+1||j==1&&i<n/2+1||j==n&&i>n/2+1||i==n/2+1||j==n/2+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
