package myPractice;

//DECLARING AND ACCESSING VARIABLES IN ONE CLASS.


class Five {
	static int k;//global var
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		int j=4;
		//int k;//local variable
		k=logic(i,j);
		System.out.println(k);
	}
	
	static int logic(int x,int y) {
		int z;
		if(x>y) {
			z=x+y;
		}
		else {
			z=(x+y)*5;
		}
		return z;
	}
}
