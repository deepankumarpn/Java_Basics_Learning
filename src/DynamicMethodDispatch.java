class Vegtables{
	public void show() {
		System.out.println("In Veg");
	}
}

class Tomato extends Vegtables {
public void show() {
	System.out.println("In Tomato");
	}
}

class Potato extends Vegtables{
public void show() {
	System.out.println("In Potato");
	}
}
public class DynamicMethodDispatch {
//Compile time and run time
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vegtables obj= new Tomato();		// Runtime Polymorphism
		obj.show();
		
		obj=new Potato();
		obj.show();    //Dynamic method Dispatch
	}

}
