package Arrays;

public class LargesrtnumInArray {

	public static void main(String[] args) {
		int[] arr = {3,6,3,8,3,5};
		int largest = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		System.out.println("largest element is:" + largest);


	}

}
