package myPractice;

public class bankaccount {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setini(10000.0);
		System.out.println("initial balance "+b.getini());
		b.setd(5000.0);
		System.out.println("deposit "+b.getd());
		b.setw(2000.0);
		System.out.println("withdraw "+b.getw());
		System.out.println("final balance: "+b.getfin());
	}
}
class Bank{
	double ini;
	double d;
	double w;
	double fin;
	
	public void setini(double n) {
		this.ini=n;
	}
	public double getini() {
		return this.ini;
	}
	public void setd(double d1) {
		this.d=d1;
	}
	public double getd() {
		return this.d;
	}
	public void setw(double w1) {
		this.w=w1;
	}
	public double getw() {
		return this.w;
	}
	public double getfin() {
		return ini+d-w;
	}
}
