package qspiders;
import java.util.Scanner;
public class Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int twothousand=2000;
		int fivehundred=500;
		int twohundred=200;
		int hundred=100;
		int fifty=50;
		int twenty =20;
		int ten=10;
		
		int twothousands;
		int fivehundreds;
		int twohundreds;
		int hundreds;
		int fifties;
		int twenties;
		int tens;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
		if(amount>twothousand){
			twothousands=amount/twothousand;
			amount=amount%twothousand;
			System.out.println(twothousands+ " no of 2000 notes");
			
		}
		if(amount>fivehundred){
			fivehundreds=amount/fivehundred;
			amount=amount%fivehundred;
			System.out.println(fivehundreds+ " no of 500 notes");
			
		}
		if(amount>twohundred){
			twohundreds=amount/twohundred;
			amount=amount%twohundred;
			System.out.println(twohundreds+ " no of 200 notes");
			
		}
		if(amount>hundred){
			hundreds=amount/hundred;
			amount=amount%hundred;
			System.out.println(hundreds+ " no of 100 notes");
			
		}
		if(amount>fifty){
			fifties=amount/fifty;
			amount=amount%fifty;
			System.out.println(fifties+ " no of 50 notes");
			
		}
		if(amount>twenty){
			twenties=amount/twenty;
			amount=amount%twenty;
			System.out.println(twenties+ " no of 20 notes");
			
		}
		if(amount>ten){
			tens=amount/ten;
			amount=amount%ten;
			System.out.println(tens + " no of 10 notes");
			
		}
	}

}
