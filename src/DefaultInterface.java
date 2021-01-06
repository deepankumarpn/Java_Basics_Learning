interface Demo{
	void abc();
	default void show() {
		System.out.println("Show was printed");
	}
}

class DemoInterface implements Demo{
	public void  abc() {
		System.out.println("ABC was printed");
	}
	@Override
	public void show() {
		System.out.println("New Show was printed");
	}
}
public class DefaultInterface {

	public static void main(String[] args) {
		Demo obj = new DemoInterface();
		obj.abc();
		obj.show();

	}

}
