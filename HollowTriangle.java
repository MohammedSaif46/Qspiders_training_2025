package corejava;

import java.util.Scanner;

public class HollowTriangle {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int num=4;
		
		for(int i=1;i<=num;i++)
		{
		for(int j=1;j<=num;j++)
		 {
			
				 if(i==4||j==4||i+j==num+1) {
			System.out.print("*");}
				 else
				 {
					 System.out.print(" ");
				 }
				 
		}System.out.println();
		
		
		}}}
