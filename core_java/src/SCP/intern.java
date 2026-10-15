package SCP;

public class intern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		String s2 = new String("abc");
		//System.out.println(s==s2);
		System.out.println(s.intern()==s2.intern());//intern gives the canonical representation of the String constant pool,
													//helping reuse equivalent String objects
	}

}
