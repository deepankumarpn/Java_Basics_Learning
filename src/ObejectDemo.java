
class Calc{
	int num1;
	int num2;
	int result;
	
	public void perform() {
		result=num1+num2;
	}
}


public class ObejectDemo {

	public static void main(String[] args) {

		Calc obj = new Calc();
		obj.num1=20;
		obj.num2=8;
		obj.perform();
		System.out.println(obj.result);
	}

}
