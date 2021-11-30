package scanner_;

import java.util.Scanner;

public class Basic_Scanner {
private static Scanner a;

public static void main(String[] args) {
	a = new Scanner(System.in);
	//Scanner a = new Scanner(System.in);
	System.out.println("Enter Your Name:");
	String b = a.nextLine();
	System.out.println("Gender:");
	String c = a.next();
	System.out.println("Enter Your Year of Birth:");
	int d = a.nextInt();
	System.out.println("Personal Profile:");
	System.out.println("Name:"+b);
	System.out.println("Gender:"+c);
	int e =2021-d;
	System.out.println("Age:"+e);
}
}
