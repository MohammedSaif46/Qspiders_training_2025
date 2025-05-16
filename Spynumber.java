package corejava;
import java.util.*;
public class Spynumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		int product=1;
		while(num>0) {
			int m=num%10;
			sum=sum+m;
			product=product*m;
			num=num/10;
		}
		if(product==sum) {
			System.out.println("is a Spy number");
		}
		else {
			System.out.println("is not a Spy number");
		}

	}

}
