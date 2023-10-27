package pattarern;

public class Pattern13 {
	public static void pattern13(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.printf("%4d",i*j);
			}
			System.out.println();
		}
	}

}
