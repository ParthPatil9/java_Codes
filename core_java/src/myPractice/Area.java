package myPractice;
//FIND AREA USING CONSTRUCTORS:
public class Area {

	public static void main(String[] args) {
		Ohh ar=new Ohh();
		ar.setlength(2);
		ar.setbreadth(5);
		System.out.println(ar.getlength());
		System.out.println(ar.getbreadth());
		System.out.println("area is: "+ar.getArea());
}	
}
class Ohh{
	int length;
	int breadth;
	
	public void setlength(int l) {
		this.length=l;
	}
	public int getlength() {
		return this.length;
	}
	
	public void setbreadth(int b) {
		this.breadth=b;
	}
	public int getbreadth() {
		return this.breadth;
	}
	
	public int getArea() {
		return 2*getlength()*getbreadth();
	}
	

}
