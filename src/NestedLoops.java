
public class NestedLoops {

	public static void main(String[] args) {
		System.out.println("Number print");
		for(int m=1;m<=6;m++) {
			for(int n =1;n<=m;n++) {
				System.out.print(n+" ");
			}
			System.out.println("");
		}
		
		
		System.out.println("Alphbate print");
		for(int i=1;i<=3;i++) {
			for(int j =1;j<=i;j++) {
				char c= (char) (64+j);
				System.out.print(c+" ");
			}
			System.out.println("");
		}
		
		System.out.println("Squre");
		for(int row=1;row<=4;row++) {
			for(int column =1;column<=4;column++) {
				if(row==1 || row==4) {
					System.out.print("$ ");
				}else if(row==2||row==3) {
					if(column==1 || column==4) {
						System.out.print("$ ");
					}else if(column==2||column==3) {
						System.out.print("  ");
					}
				}
			}
			System.out.println("");
		}
		
	}
}
