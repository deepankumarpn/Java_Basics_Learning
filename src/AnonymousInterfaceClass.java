interface Ride{
	void bike();
}

/*
 * //Instead using this bike class , we use Anonymous Inner class 
 * class bike implements Ride{ public void bike() { System.out.println("Ride begain.."); }
 * }
 */
public class AnonymousInterfaceClass {

	public static void main(String[] args) {
		Ride r =new Ride() {
			public void bike() {
				System.out.println("Ride begain..");
			}
		};
		r.bike();
	}
}