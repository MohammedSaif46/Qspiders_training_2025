package MultiLevelInherithence;
import java.util.Scanner;
public class Child extends Pnd{
Child(){
	System.out.println("This is Class 3 inheriting properties of Class 2");
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int ch = 0;
	  System.out.println("Enter Number 1 : ");
	    int num1 = sc.nextInt();
	    System.out.println("Enter Number 2 : ");
	    int num2 = sc.nextInt();

	while(ch<=6) {
	    System.out.println("Enter a Number Between 1-6 : ");
	    System.out.println("1 : Addition\n2 : Subtraction\n3 : Multiplication\n4 : Division\n5 : Remainder\n6 : Exit");
	    ch = sc.nextInt();

	  

	    switch(ch) {
	        case 1: {
	            int add = Child.addition(num1, num2);
	            System.out.println("Addition : " + add);
	            break;
	        }
	        case 2: {
	            int sub = Child.subtraction(num1, num2);
	            System.out.println("Subtraction : " + sub);
	            break;
	        }
	        case 3: {
	            int prod = Child.Multi(num1, num2);
	            System.out.println("Product  : " + prod);
	            break;
	        }
	        case 4: {
	            float div = Child.division(num1, num2);
	            System.out.println("Quotient : " + div);
	            break;
	        }
	        case 5: {
	            int rem = Child.remainder(num1, num2);
	            System.out.println("Remainder : " + rem);
	            break;
	        }
	        case 6: {
	            System.out.println("Exiting...");
	            break;
	        }
	        default: {
	            System.out.println("Invalid Number Entered");
	        }
	    }

	} 

}
}
