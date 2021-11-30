package loop_concepts;

import java.util.Scanner;

public class While_Loop {

	private static Scanner s;

	public static void main(String[] args) {
	    s = new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int n = s.nextInt();
	    while(n>=1) {
	    	System.out.println(n);
	    	n--;
	    }
	    
	}

}
