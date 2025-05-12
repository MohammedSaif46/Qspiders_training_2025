package qspiders;
import java.util.Scanner;
public class Case {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter : ");
		char letter=sc.next().charAt(0);
		if(letter>='A'&& letter<='Z') {
			System.out.println(letter+" is a upper case character");
		}
		else if (letter>='a' && letter<='z'){
			System.out.println(letter+" is a lower case character");
		}
		else {
			System.out.println(letter+" is not a character");
		}
	}
	}
