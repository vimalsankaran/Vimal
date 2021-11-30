package programsss;

import java.util.Scanner;

public class Fibonacci {
static int a1=0, a2=1, a3, count;
private static Scanner d;
public static void main(String[] args) {
	d = new Scanner(System.in);
	System.out.println("Enter the count:");
	int e = d.nextInt();
	System.out.println(a1);
	System.out.println(a2);
    for (int i = 2; i <= e; i++) {
    	a3=a1+a2;
		System.out.println(a3);
		a1=a2;
		a2=a3;
	}
}
}
