package Arrays;

public class ArrangeBrackets {

	public static void main(String[] args) {
		char[] arr= {'a','b',')','(','c'};
		int pointer=0;
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]=='(') {
				 char temp=arr[i];
				 arr[i]=arr[pointer];
				 arr[pointer]=temp;
				 pointer++;
				 
			 }
			 else if(arr[i]!='a') {
				 
			 }
				 			 
			 }
		 
		 for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i]);
		 }

	}

}
