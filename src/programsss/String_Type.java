package programsss;

public class String_Type {

	public static void main(String[] args) {
           
		String s = "Welcome to My World";
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		String s1 = "Welcome to My World";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		s = s+s1;
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
	}

}
