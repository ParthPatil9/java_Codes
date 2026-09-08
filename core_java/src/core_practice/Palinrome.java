package core_practice;

public class Palinrome {

	public static void main(String[] args) {
		int p = 12345;
		int reverse = 0;
		
		while(p!=0) {
			int digit = p%10;
			reverse = reverse*10 + digit;
			p = p/10;
			
			
		}
		if (p == reverse){
			System.out.println("is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}

