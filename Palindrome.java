package corejava;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int rev=0;
		int temp=num;
		while(temp>0) {
			int Inum=temp%10;
			rev=(rev*10)+Inum;
			temp = temp/10;
		}
		if(rev==num) {
			System.out.println(num+" is a palindrome Number");
		}
		else
		{
			System.out.println(num +" is not a palindrome Number");
		}
	}

}
