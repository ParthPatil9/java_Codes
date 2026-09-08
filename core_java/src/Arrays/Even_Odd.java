package Arrays;

public class Even_Odd {

	public static void main(String[] args) {
		int[] arr= {23,46,76,43,98,3};
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i]%2==0) {
				System.out.println("Even num :"+ arr[i]);
			}
			else {
				System.out.println("Odd num:"+arr[i]);
			}
		}

	}

}
