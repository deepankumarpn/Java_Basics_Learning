	/*Examples:2*/
class Printer{
	/*1.
	 * public void show(Integer i) { System.out.println(i); }
	 * 2.
	 * public void show(Double i) { System.out.println(i); }
	 * 3.
	 * public void show(Float i) { System.out.println(i); }
	 */
	
	/*Instead of above 3 constructor method*/
	public void show(Number i) {
		System.out.println(i);
	}
	
}
public class AbstractTwo {

	public static void main(String[] args) {
		Printer obj =new Printer();
		obj.show(5);
		obj.show(5.5);
		obj.show(5.4f);
		

	}

}
