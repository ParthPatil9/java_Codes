package methods;

public class three {

	public static void main(String[] args) {
		//Mobile iphone = new Mobile(); NOTE: we dont need to create OBJ IN STATIC METHOD. b
		Mobile.start();
		Mobile.stop();
	}

}
class Mobile{
	public static void start() { //static method chi copy tayar hot nahi!!
		System.out.println("start");
	}
	public static void stop() {
		System.out.println("stop");
		
	}
}
