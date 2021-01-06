
public class BreakandContinue {

	public static void main(String[] args) {
		// continue statement
		System.out.println("continue statement");
		for(int i=1;i<=10;i++) {
			if(i==7) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("   ");
		
		// break statement
		System.out.println("break statement");
		for(int i=1;i<=10;i++) {
			if(i==7) {
				break;
			}
			System.out.println(i);
		}
	}

}
