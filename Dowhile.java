
package qspiders;
import java.util.Scanner;
public class Dowhile {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		char ch;
		do {
			System.out.println("Welcome to the application");
			System.out.println("Want to print again");
			System.out.println("enter Y or y to "+"get this mesg again");
			ch = sc.next().charAt(0);
			
		}
		while(ch == 'Y'||ch=='y');

	}
}
