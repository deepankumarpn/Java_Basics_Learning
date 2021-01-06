class Emp{
	
	int eid;
	int salary;
	static String ceo="Deepan";
	
	static {  // when you load a class, it's Execute
		ceo="Deepan";
		System.out.println("In static");
	}
	
	public Emp() { // when you create an object, it's Execute
		eid=1;
		salary=3000;
		System.out.println("In constructor");
	}
	
	public void show() {
		System.out.println(eid+" : "+salary+" : "+ceo);
	}
	
	
}
public class StaticDemo {
	static int i = 0;//inside static main,data type of int i need to mention as a static
	public static void main(String[] args) {
		
		i=1;
		
		Emp deepan= new Emp();
		
		Emp muthu= new Emp();
		muthu.eid=2;
		muthu.salary= 4000;
		//muthu.ceo="Latha";
		//Emp.ceo="Latha";
		
		deepan.show();
		muthu.show();
		
	}

}
