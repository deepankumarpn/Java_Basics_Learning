class Trip{
	public void show() {
		System.out.println("Welcome To Hills Ride");
	}
}
public class AnonymousClass {
	public static void main(String[] args) {
		Trip t=new Trip() {
			public void show() {
				System.out.println("Welcome To Adventure Ride");
			}
		};
		t.show();
	}
}
