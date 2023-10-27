package string;

public class StringMethod {
	public static void main(String[] args) {
		String s1=new String("Saurabh").intern();
//		s1.intern();
		String s2="Saurabh";
//		s2.toUpperCase();
		System.out.println(s2.toUpperCase());
		System.out.println(s1==s2);
		String s3="Hello Dear how are you";
		s2.split(s3);
		
//		System.out.println(charAt(i));
//		s3.strip();
//		System.out.println(s3.strip());
        String s4="    ";
//        s4.isEmpty();
       
        System.out.println(s4.isBlank());
        for(int i=0;i<s3.trim().length();i++) {
        	System.out.println(s3.charAt(i));
        }
        
	  
	}

}
