package Qspiders;

public class Methodexample {

	public static void main(String[] args) {//caller method
System.out.println("Hola");
nmae();//method caller statement
sub();
System.err.println("Ho gaya");
	nmae();//method caller statement
	}
	public static void nmae() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}	public static void sub() {
		nmae();
		int a=10;
		int b=20;
		System.out.println(a-b);

}
}