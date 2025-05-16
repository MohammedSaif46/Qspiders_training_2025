import java.util.Scanner;
public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int temp = num;
        
        int digits = 0;
        while(temp>0){
            digits++;
            temp = temp/10;
        }
        temp = num;
        int result = 0;
        while(temp>0){
         int digit = temp%10;
         int power = 1;
         for(int i = 0; i<digits; i++){
            power *=digit;
         }
         result+= power;
         temp = temp/10;
        }
        if(num == result){
            System.out.println(num+ " is a armstrong number");
        }
        else System.out.println(num +" is not a armstrong Number");
    }
}
