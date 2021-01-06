interface Abc{
	void show();
}
class Alphabet implements Abc{
	public void show() {
		System.out.println("Interface");
	}
}
public class InterfaceTwo {

	public static void main(String[] args) {
		Abc obj =new Alphabet();
		obj.show();
	}

}
