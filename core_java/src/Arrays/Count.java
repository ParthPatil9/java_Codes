package Arrays;
/* QUESION: FIND TOTAL NUMBER OF POSITIVE & NEGATIVE NUMS*/

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2,7,3,-5,0,-6,8};
		int Negative_counter1=0;
		int Positive_counter2=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]<0) {
				Negative_counter1++;
			}
			else if(num[i]>0) {
				Positive_counter2++;
			}
			
		}
		System.out.println("number of positive nums: " +Negative_counter1++);
		System.out.println("number of negative nums: " + Positive_counter2++);

	}

}
