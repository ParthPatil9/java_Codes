package oops;

public class this_const_call {
	 public static void main(String[] args) {
	     // Create an object of the subclass (Dog)
	     School sc = new School();
	     
	 }
	}

class School {
	public School() {
		this(100);
		System.out.println("C");
	}
	public School(int a) {
		this(10,20);
		System.out.println("B");
	}
	public School(int a,int b) {
		System.out.println("A");
	}
}


