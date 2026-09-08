package core_practice;

public class Demo {

	public static void main(String[] args) {
		int num=1;
		int sum=0;
		int counter=0;
		while(counter<98) {
			if(num%7==0) {			
				
				System.out.println(num);
				counter++;
				sum=sum+num; //sum of the numbers who are divisible by 2
				//if we take num++ inside if statement it will only execute when the if condition is true but we need to iterate num.
				
			}
			
			num++;

	}
		System.out.println("sum: " + sum);
		System.out.println("total count: " + counter);

}
}