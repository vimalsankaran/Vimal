package programsss;

import java.util.Scanner;

public class Palindrome {
	 
	 private static Scanner scanner;

	public static void main(String[] args) {
		  scanner = new Scanner(System.in);
		  System.out.print("Enter a string/number : ");
		  String str = scanner.nextLine();
		  String str1 = str.toLowerCase();
		  int length = str.length();
		  boolean check=palindrome(str1);
		  if(check)
		   System.out.println("Entered String/Number is Palindrome");
		  else
		   System.out.println("Entered String/number is not Palindrome");
		  String rev = "";
		for (int k = length-1; k >= 0; k--) {
			rev=rev+str.charAt(k);
		}
		System.out.println("The Reversed String/Number is:"+rev);
		 }
		 
		public static boolean palindrome(String str1)
		 {
		  for (int i = 0,j=str1.length()-1; i <str1.length()/2; i++,j--) {
		 
		   if(str1.charAt(i)!=str1.charAt(j))
		   {
		    return false;
		   }
		 
		  }
		  return true;
		 }
		 
		}