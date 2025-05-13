package qspiders;
import java.util.Scanner;
public class Oval {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the input :");
		char input=sc.next().charAt(0);
		if(input>='A'&& input<='z') { 
		if(input=='A'|| input=='E'|| input=='I'|| input=='O'|| input=='U'||input=='a'|| input=='z'|| input=='i'|| input=='o'|| input=='u') {
			System.out.println("input is vowel");
		}
		else {
			System.out.println("input is not a character");
		}}
		else if(input>='0'&&input<='9'){
			System.out.println("input is number");
			
		}
		else {
			System.out.println("input charaacter is symbol");
		}
	}}
	


