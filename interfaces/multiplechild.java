package interfaces;

public class multiplechild implements Multipar1,multipar2 {
	public static void main (String[] args) {
	System.out.println(Multipar1.a);
	Multipar1.demo1();
	System.out.println(multipar2.b);
	multipar2.demo2();
	}
}
     