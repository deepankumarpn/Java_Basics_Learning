abstract class Writer{
	public abstract void write();
}

class Pen extends Writer{
	public void write() {
		System.out.println("In Pen");
	}
}

class Pencil extends Writer{
	public void write() {
		System.out.println("In Pencil");
	}
}

class Kit{
	public void doSomething(Writer p) {
		p.write();
	}
}
public class AbstractThree {

	public static void main(String[] args) {
		Kit k = new Kit();
		Writer p = new Pen();
		Writer pc = new Pencil();
		k.doSomething(p);

	}

}
