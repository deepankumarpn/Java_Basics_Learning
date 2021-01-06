/* Type 1 */

class A1{
	
	public void show() {
		System.out.println(" In A1");
	}
}
class B1 extends A1{
	@Override				//Annotation
	public void show() {
		System.out.println(" In B1"); 		//Method Overriding
	}
	
}
/* Type 2 */

class A12{
	
	public void show() {
		System.out.println(" In A12");
	}
}
class B12 extends A12{
	public void show() {
		super.show(); 		//Method Overriding
		System.out.println(" In B12");
	}
	
}
public class MethodOverridingOne {

	public static void main(String[] args) {
		B1 obj = new B1();
		obj.show();
		
		B12 obj2 = new B12();
		obj2.show();
	}

}
