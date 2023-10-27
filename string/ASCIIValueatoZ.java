package string;

public class ASCIIValueatoZ {
	public static void main(String[] args) {
		String z="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		ascii("Saurabh Kori");
		
		

	}
	public static void ascii(String z) {
		for(int i=0;i<z.length();i++) {
			
			System.out.println(z.charAt(i)+"---ASCII VALUE---"+z.codePointAt(i));
			 
			
		}
	}

	}
