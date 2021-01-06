interface  Writer1{
	void write();
}

class Pen1 implements Writer1{
	public void write() {
		System.out.println("In Pen");
	}
}

class Pencil1 implements Writer1{
	public void write() {
		System.out.println("In Pencil");
	}
}

class Kit1{
	public void doSomething(Writer1 p) {
		p.write();
	}
}
public class InterfaceOne {

	public static void main(String[] args) {
		Kit1 k = new Kit1();
		Writer1 p = new Pen1();
		Writer1 pc = new Pencil1();
		k.doSomething(p);

	}

}
