package oops;

public class one {
	 public static void main(String[] args) {
	     // Create an object of the subclass (Dog)
	     School sc = new School();  
	 }
	}

class School {
	String name="pp";
	public School() {
		this(100);
		System.out.println("C");
	}
	public School(String name) {
		this(1,2);
		this.name=name;
		System.out.println("B");
		}
	public School(int a) {
		this(10,20);
		System.out.println("B");	
	}
	public School(int a,int b) {
		System.out.println("A");
	}
	
	
}


