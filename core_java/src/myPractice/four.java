package myPractice;
//find length of last word
public class four {

	public static void main(String[] args) {
		String s="hello world ";
		int counter=0;
		
		int i=s.length()-1;
		
		
		while(i>=0 && s.charAt(i)==' ') {
			i--;
		}
		while(i>=0 && s.charAt(i)!=' ') {
			counter++;
			i--;
		}
		System.out.println(counter);

	}

}

