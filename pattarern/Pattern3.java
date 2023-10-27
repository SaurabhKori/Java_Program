package pattarern;

public class Pattern3 {
	public static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==2) {
					System.out.print("@ ");
				}
				else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}

}
