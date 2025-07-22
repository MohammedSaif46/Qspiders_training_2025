package abstact;
public class calcivar1 {
	public static void  main(String[] args) {
		calciv1 calciv1=new calciv1();
		calciv2 calciv2=new calciv2 ();
		int a=4, b=6;
		System.out.println("add:"+calciv1.add(a,b));
		System.out.println("sub:"+calciv1.sub(a,b));
		System.out.println("power:"+calciv1.power(a));
		System.out.println("square:"+calciv2.square(a));
		System.out.println("power:"+calciv2.cube(a));		
	}
}
