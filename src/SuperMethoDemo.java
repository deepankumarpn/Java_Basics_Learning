class A{
	public A() {
		System.out.println("in A");
	}
	public A(int i) {
		System.out.println("in A int "+i);
	}
}
class B extends A{
	public B() {
		super(6);
		System.out.println("in B"+" int 6");
	}
	public B(int i) {
		super(i);
		System.out.println("in B int "+i);
	}
}
public class SuperMethoDemo {

	public static void main(String[] args) {
		B obj =new B(5);
		B obj1 =new B();

	}

}
