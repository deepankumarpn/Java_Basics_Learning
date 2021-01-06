
public class TwoDimesionalArrayAndEnhancedForLoop {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {2,4,6,8};
		int c[]= {5,6,7,8};
		
		int d[][]= {
				{1,2,3,4},
				{2,4,6,8},
				{5,6,7,8}
		};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(" "+d[i][j]);
			}
			System.out.println(" ");
		}

		System.out.println(" ");
		
		
		int e[][]= {
				{1,2,3,4},
				{2,4,6},
				{5,6,7,8,9}
		};
		
		for(int i=0;i<e.length;i++) {
			for(int j=0;j<e[i].length;j++) {
				System.out.print(" "+e[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("Enhanced For Loop");
		
		for(int k[]: e) {
			for(int l:k) {
				System.out.print(" "+l);
			}
			System.out.println("");
		}
	}

}
