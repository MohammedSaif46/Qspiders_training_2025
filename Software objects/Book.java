package QSPIDERS;

public class Book {
 String title;
 double price;
 String auth;
Book(){
	System.out.println(" i am from no arg const");
}
 Book(String title,double price,String auth){
this();
System.out.println("__________________________");
	 this.title=title;
this.price=price;
this.auth=auth;

}}