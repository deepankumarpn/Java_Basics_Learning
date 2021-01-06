
/*
 * Inner class have 3 basic types,
 * 
 * member class
 * static class
 * Anonymous class
 */
class Outer{
	int i;
	
	public void show() {
		System.out.println("Outer show  method printing");
	}
	
	static class Inner{
		 public void display() {
			 System.out.println("In side, inner display method printing");
		 }
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show();
		
		// Inner class calling
	
		Outer.Inner obj2 =new Outer.Inner();
		obj2.display();

	}

}

