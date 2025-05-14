package qspiders;
import java.util.Scanner;
public class Perfectnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the num :");
		int num =sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++) {
			
		
		if(num%i==0) {
			sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println(num+" is a perfect number");
		}
		else
				{
				System.out.println(num+" is not a perfect number");}
				}	
	

}