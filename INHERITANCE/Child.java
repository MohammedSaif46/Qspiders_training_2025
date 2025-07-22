package INHERITANCE;

public class Child extends Parent {
	int id=88;
	static {
		System.out.println("I am from Child Static");
	}
	{
		System.out.println("I am from Child non Static");
	}
	
	public void study() {
		System.out.println("I do when ever "+ " i want ");
	}
	
	public static void main(String arg[]) {
		
		Parent p =new Parent();
		System.out.println(p.age);
		System.out.println(p.bgroup);
		p.provide_food();
		System.out.println("___________________");
		
		Child c = new Child();
		System.out.println(c.age );
		System.out.println(p.bgroup);
		c.provide_food();
		System.out.println(p.age);
	}

}
