package Array1;

public class Return {
        public static int[] getNumbers() {
        int numbers[] = {10, 20, 30, 40, 50};
        return numbers;
    }
    public static void main(String[] args) {
        int result[] = getNumbers();
     
        for (int num : result) {
            System.out.println(num);
        }
    }
}