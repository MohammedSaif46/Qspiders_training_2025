package Qspides;

public class Daimond {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int Space=n/2;
		int Star=1;
		for(int i=1;i<=n;i++){
	        for(int j=1;j<=Space;j++){
	            
	                System.out.print(" ");
	        }
	                for(int k=1;k<=Star;k++){     
	                  System.out.print("*");
	            }
		  System.out.println();
		  if(i<(n/2)+1) {
			  
		  
Space--;
Star=Star+2;
	}
		  else {
			  Space++;
			  Star=Star-2;
		  }
	}}
	}
