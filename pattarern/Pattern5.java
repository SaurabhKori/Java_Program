package pattarern;

public class Pattern5 {
	public static void pattern5(int n){
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if( i==j||i+j==n+1) {
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
