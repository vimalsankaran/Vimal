package programsss;

import java.util.Scanner;

public class Palindrome_Number {

	private static Scanner a;

	public static void main(String[] args) {  
			  int rem,rev=0,temp;    
			  System.out.println("Enter the number:");
			  a = new Scanner(System.in);
			  int n = a.nextInt();
			  temp=n;    
			  while(n>0){    
			   rem=n%10; 
			   rev=(rev*10)+rem;    
			   n=n/10;    
			  }    
			  if(temp==rev)    
			   System.out.println(temp+" is palindrome number ");    
			  else    
			   System.out.println(temp+"is not palindrome");    
			} 
}
