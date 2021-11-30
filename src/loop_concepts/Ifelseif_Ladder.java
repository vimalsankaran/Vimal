package loop_concepts;

import java.util.Scanner;

public class Ifelseif_Ladder {

	private static Scanner a;

	public static void main(String[] args) {
            a = new Scanner(System.in);
            for (int i = 1; i <= 5; i++) {       
            	switch (i) {
				case 1: System.out.println("Enter Your Tamil Mark:");
					break;
				case 2: System.out.println("Enter Your English Mark:");
				break;
				case 3: System.out.println("Enter Your Maths Mark:");
				break;
				case 4: System.out.println("Enter Your Science Mark:");
				break;
				case 5: System.out.println("Enter Your Social Mark:");
				break;
				default: System.out.println("   ");
					break;
				}
            	int mark = a.nextInt();
            	if(mark<50) { 
            		System.out.println("Fail");
            	}else if (mark>=50 && mark<60) { 
            		System.out.println("D Grade");
            	}else if (mark>=60 && mark<70) { 
            		System.out.println("C Grade");
            	}else if (mark>=70 && mark<80) { 
            		System.out.println("B Grade");
            	}else if (mark>=80 && mark<90) { 
            		System.out.println("A Grade");
            	}else if (mark>=90 && mark<=100) { 
            		System.out.println("S Grade");
            	}else {
            		System.out.println("Mark Invalid!");
            	}
			}
	}
}
