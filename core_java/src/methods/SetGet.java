package methods;

public class SetGet {

	public static void main(String[] args) {
		Car car = new Car();
		car.setMileage(55);
		car.setName("honda");
		System.out.println(car.getMileage());
		System.out.println(car.getName());
	}
}
class Car{
	int mileage;
	String name;
	
	public int getMileage() {
		return this.mileage;
	}
	public void setMileage(int mil) {
		if(mil>50) {
			this.mileage=mil;
		}
		else {
			this.mileage=0;
		}}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
			this.name=name;
	}
}

