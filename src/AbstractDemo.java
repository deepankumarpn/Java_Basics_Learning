/*Example: 1*/
abstract class Human		//Human class called as a Abstract class
{
	public abstract void eat();
	public void walk() {
		
	}
}
class Man extends Human{		//Man class called as Concrete Class
	public void eat() {
		
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		Human obj= new Man();

	}

}
