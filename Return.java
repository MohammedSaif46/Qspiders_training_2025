package qspiders;

public class Return {

	public static void main(String[] args) {
		int res=name(10,20);
		System.out.println(res);
		System.out.println(name(10,60));
		System.out.println("Done");
	}
	public static int name(int a,int b) {
		return a+b;
	}

}
