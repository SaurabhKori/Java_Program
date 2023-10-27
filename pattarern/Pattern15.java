package pattarern;

public class Pattern15 {
	public static void pattern15(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(j>=i) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
			
		}
	}

}
