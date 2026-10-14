package methods;

public class GlobalnLocalvariable {
	public static void main(String[] args) {
		student stud=new student();
		stud.global="pp";
		System.out.println(stud.global);
		stud.get();
	}
}
class student{
	String global; //global variable(inside class but outside the method)
	public void get() {
		String local="abc";
		System.out.println(local); //local variable(inside class & method both)
		
		System.out.println(this.global); //global variable accessed inside a method 
		//this keyword is used to call global variable.
	}
}
