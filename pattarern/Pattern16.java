package pattarern;

public class Pattern16 {

		public static void pattern16(int num) {
			for(int i=1;i<=num;i++) {
				for(int j=1;j<=num;j++) {
					if(i+j<=num+1) {
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


