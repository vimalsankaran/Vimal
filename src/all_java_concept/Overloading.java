package all_java_concept;

public class Overloading {
private void demo(int a, char b) {
	System.out.println(a+b);  //adding char & int adds ascii value of char(i is 105(ascii) & int
	System.out.println(b);
	System.out.println(a);

}
private void demo(int a, int b, int c) {
	System.out.println(a+b+c);

}
private void demo(int a, long b, double c) {
	System.out.println(a+b+c);

}

private void demo(int a, String c) {
	System.out.println(a+c);

}
public static void main(String[] args) {
	Overloading obj = new Overloading();
	obj.demo(20, 'i');
	obj.demo(125, 225, 12325);
	obj.demo(30, "Years");
	obj.demo(12, 125l, 12.67);
}
}
