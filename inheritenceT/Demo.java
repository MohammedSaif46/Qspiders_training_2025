package inheritenceT;

import java.util.Scanner;

public class Demo extends Ans  {
Demo(){
	System.out.println("This Is Class 3 Inheriting Class 1 Properties");
}
public static void main(String[] args) {
	Demo D = new Demo();
	Scanner sc = new Scanner(System.in);
	System.out.println("Num 1 : ");
	int num1 = sc.nextInt();
	System.out.println("Num 2 : ");
	int num2 = sc.nextInt();
	int add = D.addition(num1, num2);
	int sub = D.subtraction(num1, num2);
	System.out.println("Addition of "+num1+" and "+num2+" = "+add);
	System.out.println("Subtraction of "+num1+" and "+num2+" = "+sub);
}
}
