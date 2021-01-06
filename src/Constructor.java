
class Calc2{
	int num1;
	int num2;
	String op;

	public Calc2() {
		num1=0;
		num2=0;
		op=" nothing";
	}
	public Calc2(int i) {
		num1=i;
		num2=0;
		op=" nothing";
	}
	public Calc2(int i, int j) {
		num1=i;
		num2=j;
		op=" nothing";
	}
	
	public Calc2(int i, int j,String ope) {
		num1=i;
		num2=j;
		op=ope;
		
	}


}
public class Constructor {

	public static void main(String[] args) {
		
		//Calc2 obj= new Calc2();
		//Calc2 obj= new Calc2(1);
		//Calc2 obj= new Calc2(1,2);
		Calc2 obj= new Calc2(1,2,"add");
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.op);

	}

}
