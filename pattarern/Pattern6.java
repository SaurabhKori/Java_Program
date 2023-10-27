package pattarern;

public class Pattern6 {
	public static void pattern6(int n) {
		if(n%2!=0) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(i==j||i+j==n+1||i==n/2+1||j==n/2+1) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}else {
			System.out.println("Enter Odd number");
		}
	}

}
