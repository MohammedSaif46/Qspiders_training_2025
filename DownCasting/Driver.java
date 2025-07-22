package DownCasting;

public class Driver {
public static void main(String [] args) {
	Cab c = new Prime();
	Prime p = (Prime) c;
	System.out.println(p.price1);
	System.out.println(p.price4);
}
}
