package programsss;

import java.util.Scanner;

public class SumofOddandEven {
	    private static Scanner s;

		public static void main(String args[])
	    {
	    	System.out.println("Enter the number:");
	    	s = new Scanner(System.in);
	    	//Scanner s = new Scanner(System.in);
	    	int a = s.nextInt();
	        int num1=0, num2 =0;
	        while (a > 0)
	        {
	            if ((a % 10) % 2 == 0)
	                num1 = num1 + a % 10;
	            else
	                num2 = num2 + a % 10;
	            a = a / 10;
	        }
	        System.out.println("Sum of Even Numbers : " + num1);
	        System.out.println("Sum of Even Numbers : " + num2);
	    }
	}
