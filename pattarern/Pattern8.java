package pattarern;

public class Pattern8 {
	public static void pattern8(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||i==n||j==n||i==n/2+1||j==n/2+1||i==j||i+j==n+1) {
					System.out.print(" * " );
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
