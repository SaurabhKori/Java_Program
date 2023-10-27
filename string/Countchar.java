package string;

public class Countchar {
	public static void main(String[] args) {
	countchar("Saurabh kori");
	}
	public static void countchar(String z) {
		int count=0;
		for(int i=0;i<z.length();i++) {
			if(z.charAt(i)!=' ') {
				count++;
			}
	 		}
		System.out.println(count);
	
	}
     

}
