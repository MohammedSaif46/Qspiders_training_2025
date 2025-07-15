package QSPIDERS;

public class Boolk_Driver {
public static void main(String[] args) {
	
	Book B1=new Book("harry potter",20.0,"jk"); 
	Book B2=new Book("java",40.0,"james");
	Book B3=new Book("titanic",200.0,"bonda") ;
	
System.out.println(B1.title);	
System.out.println(B2.price);
System.out.println(B1.auth);
System.out.println("______________________");

System.out.println(B2.title);	
System.out.println(B2.price);
System.out.println(B2.auth);
System.out.println("______________________");

System.out.println(B3.title);	
System.out.println(B3.price);
System.out.println(B3.auth);
System.out.println("______________________");
}
}
