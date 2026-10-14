package basic;

public class palindrome {

	public static void main(String[] args) {
		String s="nAyan";
		String s2="";
		
		for(int i=s.length()-1;i>=0;i--) {
			s2=s2+s.charAt(i);
		}
		System.out.println(s2);
	
	     if(s.equalsIgnoreCase (s2)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("non-palindrome");
	}
}
}
