package myPractice;

public class construct {

	public static void main(String[] args) {
		Car c = new Car("bullet",9);//car()is a parameterised constructor.
	}
}
class Car{
	String name;
	int i;
	public Car(String name,int i) {
		System.out.println(name+ + i);
	}
}
//copy const??