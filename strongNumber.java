import java.util.Scanner;
public class strongNumber {
   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int original = num;
        int sum =0;
        while(num !=0){
            int digit = num%10;
            int fact = 1;
            for(int i = 2;i<=digit;i++){
               fact *= i;
            }
            sum+=fact;
            
            num /=10;
        }
        if(sum == original){
            System.out.println(original+ " is a Strong Number");
        }
        else System.out.println(original+ " is not a Strong Number");
    }
}
