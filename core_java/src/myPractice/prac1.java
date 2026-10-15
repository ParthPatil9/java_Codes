package myPractice;

public class prac1 {

	public static void main(String[] args) {
		State s=new State(415539);
		s.setpin(411021);
		System.out.println("pincode: " +s.getpin());
		s.setjil("Satara");
		System.out.println("Jilha: "+s.getjil());
		s.settal("Karad");
		System.out.println("taluka: "+ s.gettal());
	}

}
class State{
	int pin;
	String jil;
	String tal;
	
	public State(int pin) {
		System.out.println(pin);
		
	}
	public void setpin(int p) {
		this.pin=p;
	}
	public int getpin() {
		return this.pin;
	}
	public void setjil(String j) {
		this.jil=j;
	}
	public String getjil() {
		return this.jil;
	}
	public void settal(String t) {
		this.tal=t;
	}
	public String gettal() {
		return this.tal;
	}
	
}
