package Arrays;

public class ArraySum {

	public static void main(String[] args) {
			int[] arr = {3,5,7,2,6};
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum = sum + arr[i];
			}
			System.out.println("sum of all elements: " + sum );

		

	}

}
