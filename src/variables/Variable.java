package variables;

public class Variable {
    static int a,b;
    public static void add() {
    	a = 25;
    	b = 75;
    	System.out.println(a+b);
    }
	public static void multi() {
		System.out.println(a*b);
	}
	public static void main(String[] args) { 
         multi();
	}
}
