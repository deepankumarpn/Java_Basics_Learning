class Students{
	private int roll_no;
	private String name;
	
	public int getRoll_no() {
		System.out.println("User Get the roll no");
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		System.out.println("User Set the roll no");
		this.roll_no = roll_no;
	}
	public String getName() {
		System.out.println("User Get the Name");
		return name;
	}
	public void setName(String name) {
		System.out.println("User Set the Name");
		this.name = name;
	}
	
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Students obj = new Students();
		//set the value 
		obj.setRoll_no(2);
		obj.setName("Deepankumar");
		
		//Get the Value
		System.out.println(obj.getRoll_no());
		System.out.println(obj.getName());

	}

}
