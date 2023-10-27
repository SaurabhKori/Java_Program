package pattarern;

public class Pattern18 {
	public static void pattern18(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i+j<=num) {
					System.out.print("*    ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
