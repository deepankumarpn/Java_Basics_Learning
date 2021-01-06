
public class WrapperClass {

	public static void main(String[] args) {

		
		/*Example 1*/
		
		int i =5;		//Primitive Data types
		//Integer ii= new Integer(i);		//Boxing-Wrapping
		Integer ii= new Integer(5);		//Boxing-Wrapping
		int j=ii.intValue();// Un-Boxiing - Un-Wrapping
		
		Integer value =i;		//Auto Boxing - Auto Wrapping
		int k=value;		//Auto Unboxing  -  Auto Unwrapping
		
		/*Example 2*/
		
		String str="123";
		int l=Integer.parseInt(str);
		System.out.println(l);
	}

}
