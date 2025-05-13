package qspiders;
import java.util.Scanner;
public class Evennum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the limit");
		int c=sc.nextInt();
		int sum=0;
		for(int i=1;i<=c;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("Total sum till Limit :"+sum);
	}

}
