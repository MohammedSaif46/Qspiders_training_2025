package Upcasting1;

public class Cab_Driver {
public static void main(String[] args) {
	Cab1 c = new Cab2();
	System.out.println(c.price2);
	System.out.println(c.price1);
}
}
