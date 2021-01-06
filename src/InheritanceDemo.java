//Super Class
class CalcPro{
	public int add(int i, int j) {
		return i+j;
	}
}

//Sub Class  
//Super class
class CalcProAdv extends CalcPro{
	public int mul(int i, int j) {          //Single Inheritance
		return i*j;
	}
}
//Sub Class
class CalcProMax extends CalcProAdv{
	public int sub(int i, int j) {        // Multi Inheritance
		return i-j;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		CalcProMax obj = new CalcProMax();
		System.out.println(obj.add(6,2));
		System.out.println(obj.sub(10,4));
		System.out.println(obj.mul(3,2));
		
	}

}
