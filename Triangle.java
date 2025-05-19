package Qspides;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int Space=n-1;
		int Star=1;
		for(int i=1;i<=n;i++){
	        for(int j=1;j<=Space;j++){
	            
	                System.out.print(" ");
	        }
	                for(int k=1;k<=Star;k++){     
	                  System.out.print("*");
	            }
		  System.out.println();
Space--;
Star=Star+2;
	}
	}
	}
