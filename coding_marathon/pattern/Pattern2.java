package coding_marathon.pattern;

public class Pattern2 {
	public static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j<=n) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

		for(int i=2;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=i) {
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
