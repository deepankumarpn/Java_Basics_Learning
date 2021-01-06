class Calc3{
	public int add(int...n) {
		int sum =0;
		for(int i : n) {
			System.out.println("i :"+i);
			System.out.println("n :"+n);
			System.out.println(" ");
			sum=sum+i;
		}
		return sum;
	}
	
}
public class VarargsDemo {

	public static void main(String[] args) {
		Calc3 obj=new Calc3();
		System.out.println(obj.add(1,2,3,4,5,6,7,8,9));
	}

}
