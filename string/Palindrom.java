package string;

public class Palindrom {
	public static void main(String[] args) {
		int num=124;
		String pan=""+num;
		System.out.println(palindrom(pan));;
		
	}
	public static String palindrom(String pan) {
		int n=pan.length()/2;
		int j=pan.length()-1;
		for(int i=0;i<n;i++) {
			if(pan.charAt(i)!=pan.charAt(j)) {
			 return "not palindrom";
			}
			
			j--;
		}
		return "palindrom";
		}

}
