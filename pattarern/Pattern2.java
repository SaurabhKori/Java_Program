package pattarern;

public class Pattern2 {
	public static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("( "+i+","+j+"), ");
			}
			System.out.println();
		}
	}

}
