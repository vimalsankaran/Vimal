package loop_concepts;

import java.util.Scanner;

public class Nested_For3 {

	private static Scanner s;

	public static void main(String[] args) {
	    s = new Scanner(System.in);
	    System.out.println("Enter the number of rows:");
	    int row = s.nextInt();
	    
            for (int i = 0; i < row ; i++) {
				for (int j = row-i; j >1 ; j--) {
					System.out.print(" ");
				}
				for (int j = 0; j <=i ; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
	}

}
