package Two_d_array;

public class sumof_allrows {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int sum=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			
			System.out.print(arr[i][j]);
			sum=sum+arr[i][j];
			

			}
			System.out.println();
			System.out.println("Sum of row is "+ sum);

		}
		

	}
}

