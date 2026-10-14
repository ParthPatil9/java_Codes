package basic;

public class one {

	public static void main(String[] args) {
		String s = "        hello       ";
		String s2 = s.stripLeading();
		System.out.println(s.length());
		System.out.println(s);
		System.out.print(s2);
		
		String s3 = s.stripLeading();
		System.out.println(s.trim());
		System.out.println(s3);

		

		
	}
}
