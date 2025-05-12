package qspiders;

import java.util.Scanner;
public class Elseif {
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    if(num%5==0){
        System.out.println("number is divisible by 5");
        
    }
    else if(num%11==0)
    {
        System.out.println("number is divisible by 11");
    }
    else if(num%5!=0 && num%11!=0){
        System.out.println("number is not divisible by 5 and 11");
    }
    
}    
}

