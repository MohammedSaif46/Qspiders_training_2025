package Array;

public class Declare {
	public static void main(String[] args) {
	/*	int a;
		a = 10;
		int b[];
		b=10;
		int [] c;
		c = null; */
		
		int arr[]=new int [5];
		 arr[0]=10;
		 arr[1]=11;
		 arr[2]=12;
		 arr[3]=13;
		 arr[4]=14;
		 //arr[5]=15;
		 
		 System.out.println(arr);
		 System.out.println(arr.length);
		 for(int i=0;i<arr.length;i++) {
    		 System.out.print(arr[i]+",");
		 }
		 
		 
		 System.out.println();
		/* System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[2]);
		 System.out.println(arr[3]);
		 System.out.println(arr[4]);
		 //System.out.println(arr[5]);
		  * */
		  
		 
		 System.out.println("-------------------");
         int aa[]= {1,2,3,4,5,6,7,8,9};
    	 System.out.println(aa);
    	 for(int i=0;i<aa.length;i++) {
    		 System.out.print(aa[i]+". ");
    	 }
		
		
	}

}
 