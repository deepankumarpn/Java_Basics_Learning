
import java.util.Scanner;

public class MultiplicationTable {
   /* public static void main(String args[])
    {
        int n, c;
        System.out.println("Enter an integer to print it's multiplication table:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Multiplication table of " + n);

        for (c = 1; c <= 10; c++)
            System.out.println(c + "*" + n + " = " + (n*c));
    }*/

   /*Hacker rank Task*/
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter integer value of N : ");
        int N = scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(N+" x "+i+" = "+ N * i);
        }
        scanner.close();
    }

}
