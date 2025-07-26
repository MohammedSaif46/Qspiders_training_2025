package Array1;

public class Example {

	public static void main(String[] args) {
	int [] arr= {1,2,3,4,5,6,7,8,9,10};
	for(int j=0;j<arr.length;) {
		for(int i=0;i<arr.length;) {
			System.out.println(3*arr[i++]+"");
		}
		System.out.println("");
		System.out.println(4*arr[j++]);
	}
	}
}    