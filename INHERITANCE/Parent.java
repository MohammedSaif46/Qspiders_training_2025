package INHERITANCE;

public class Parent {
	int age =50;
	String bgroup = "Ab+ve";
	
	static {
		System.out.println("I am from parent Static");
	}
	{
		System.out.println("I am from parent  non  Static");
	}
	
	public void provide_food()
	{
		System.out.println("I take that responsibiliy");
	}
}
