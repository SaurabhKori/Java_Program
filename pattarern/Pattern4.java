package pattarern;

public class Pattern4 {
	public static void pattern4(int n) {
		if(n%2!=0) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n/2+1||j==n/2+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		}
		else {
			System.out.println("Please enter odd number");
		}
	}

}
