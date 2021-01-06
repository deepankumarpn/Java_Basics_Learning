interface Car{
	void model();
}
public class FunctionalInterfaceOrLambdaExpression {

	public static void main(String[] args) {
		
		/*
		 * Instead this we use below Lambada Expressions
		 * 
		 * Car obj=new Car() { public void model() {
		 * System.out.println("Welcome to Car Model"); } };
		 */
		
		Car obj=() -> System.out.println("Welcome to Car Model");
		
		obj.model();	
	}

}
