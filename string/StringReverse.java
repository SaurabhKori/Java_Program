package string;

public class StringReverse {
	public static void main(String[] args) {
		reverse("Saurabh");
	}
	public static void reverse(String pan) {
		String ch="";
		for(int i=pan.length()-1;i>=0;i--) {
		 ch=ch+pan.charAt(i);
		}
		System.out.println(ch);
	}

}
