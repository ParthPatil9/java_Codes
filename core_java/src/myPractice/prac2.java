package myPractice;
//CALCULATOR
public class prac2 {

	public static void main(String[] args) {
		Cal c=new Cal();
		c.setnum1(20);
		c.setnum2(2);
		
		System.out.println(c.add());
		System.out.println(c.sub());
		System.out.println(c.mul());
		System.out.println(c.div());
	}
}
class Cal{
	int num1;
	int num2;
	int result;
	
	public void setnum1(int n1) {
		this.num1=n1;
	}
	public int getnum1() {
		return this.num1;
	}
	public void setnum2(int n2) {
		this.num2=n2;
	}
	public int getnum2() {
		return this.num2;
	}
	public int add() {
		return num1+num2;
	}
	public int sub() {
		return num1-num2;
	}
	public int mul() {
		return num1*num2;
	}
	public int div() {
		return num1/num2;
	}
}
