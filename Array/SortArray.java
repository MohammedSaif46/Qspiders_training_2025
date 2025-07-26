package Array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
        int[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr); 
  
        System.out.print(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
    }
}

