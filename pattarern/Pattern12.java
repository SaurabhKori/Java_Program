package pattarern;

public class Pattern12 {
	public static void pattern12(int n) {
		int a=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.printf("%4d",a );
			   a++;
			}
			System.out.println();
		}
	}

}
