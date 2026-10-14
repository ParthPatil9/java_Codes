package methods;

public class calculator {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.add(10, 20);
		calc.sub(20, 30);
		calc.mult(4, 3);
		calc.div(12, 02);
		calc.mod(11, 03);
	}
}
class Calculator{
	public void add(int one,int two) {   //we dont hard code values in in method, u jus provide place holders for the user defined values.
		System.out.println(one+two);
	}
	public void sub(int one,int two) {   //we dont hard code values in in method, u jus provide place holders for the user defined values.
		System.out.println(one-two);
	}
	public void mult(int one,int two) {   //we dont hard code values in in method, u jus provide place holders for the user defined values.
		System.out.println(one*two);
	}
	public void div(int one,int two) {   //we dont hard code values in in method, u jus provide place holders for the user defined values.
		System.out.println(one/two);
	}
	public void mod(int one,int two) {   //we dont hard code values in in method, u jus provide place holders for the user defined values.
		System.out.println(one%two);
	}
}
