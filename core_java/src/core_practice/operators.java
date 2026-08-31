package core_practice;

public class operators {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(num%3);
		System.out.println(num/2);
		System.out.println(num*3);
		System.out.println(num+3);
		System.out.println(num-3);
		num+= 5;
		System.out.println(num);
		//now the num is 15
		num-=5;
		System.out.println(num);
		//now the num is 10
		num%=4;
		System.out.println(num);
		//now the num is 2
		num/=2;
		System.out.println(num);
		//now the num is 1
		num*=5;
		System.out.println(num);
		//now the num is 5

	}

}
