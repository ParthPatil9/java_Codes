package core_practice;

//FIRST 5 EVEN NUMBERS

public class EvenNum {

	public static void main(String[] args) {
		int num=1;
		int counter=0;
		while(counter<5) {
			if(num%2==0) {			//what if we exchange while & if
				counter++;
				System.out.println(num);
				//if we take num++ inside if statement it will only execute when the if condition is true but we need to iterate num.
				
			}
			num++;

			

		}
		System.out.println("number of counts:" + counter);


	}

}
