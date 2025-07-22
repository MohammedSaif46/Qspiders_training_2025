package inheritenceT;
import java.util.Scanner;
public class Pnd extends Ans {
Pnd(){
	System.out.println("This Is Class 2 Inheriting Class 1 Properties");
}
public static void main(String[] args) {
	Pnd p = new Pnd();
	Scanner sc = new Scanner(System.in);
	System.out.println("Num 1 : ");
	int num1 = sc.nextInt();
	System.out.println("Num 2 : ");
	int num2 = sc.nextInt();
	int add = p.addition(num1, num2);
	int sub = p.subtraction(num1, num2);
	System.out.println("Addition of "+num1+" and "+num2+" = "+add);
	System.out.println("Subtraction of "+num1+" and "+num2+" = "+sub);
}
}
