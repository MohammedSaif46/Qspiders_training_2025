package QSpiders;

public class Array {
public static void main(String[] args) {
	int[] arr= {1,2,3,4};
	
	for(int i=0;i<arr.length-1;i++) {
		arr[i]=arr[i+1];}
	
		arr[arr.length-1]=1;
		for(int num:arr) {
		System.out.println(num);
	}
}
}


