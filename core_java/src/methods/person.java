package methods;

public class person {

	public static void main(String[] args) {
		Per p=new Per("pp ",9);
		
		System.out.println(p.name+ p.age);
		p.setname("a");
		p.setage(1);
		p.display();
	}
}
class Per{
	String name;
	int age;
	
	public Per(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void setname(String n) {
		this.name=n;
	}
	public String getname() {
		return this.name;
	}
	public void setage(int a) {
		this.age=a;	
	}
	public int getage() {
		return this.age;
	}
	public void display() {
		System.out.println(name+" "+age);
	}
}
