package twodarraypkg;

import java.util.Scanner;

public class xylem {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number :");
	int num = sc.nextInt();
	
	
	int l =0;
	int sum=0;
	int mid=0;
	//2020
	while(num>0) {
		int digit=num%10;//2
		l=l+1;//4
		num/=10;//0
		if(l==1 || num==0) {
			sum= sum+digit;//2 
		}
		if(l!=1 && num !=0) {
			mid=mid+digit;//2
		}
	}
	if(sum==mid) {
		System.out.println("it is a xlyem");
		
	}
	else {
		System.out.println("it is not a xyleam");
	}
	
	
}
}
