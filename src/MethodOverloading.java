class Casio{
	//method overloading
	public void add(int i) {
		System.out.println(i);
	}
	public void add(double d) {
		System.out.println(d);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Casio obj= new Casio();
		//method overloading
		obj.add(6);
		obj.add(6.5);
	}

}
