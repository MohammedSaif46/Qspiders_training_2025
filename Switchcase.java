package qspiders;
import java.util.Scanner;
public class Switchcase {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the day :");
		String choice=sc.next();
		switch (choice) {
		case "monday":{
			System.out.println("lemon rice");
			break;
		}
		case "tuesday":{
			System.out.println("idli");
			break;
		}
		case "wednesday":{
			System.out.println("dosa");
			break;
		}case "thursday":{
			System.out.println("puri");
			break;
		}case "friday":{
			System.out.println("vada");
			break;
		}case "saturday":{
			System.out.println("uppit");
			break;
		}
		case "sunday":{
			System.out.println("maggie");
			break;
		}
		default:{
			System.out.println("no food");
		}	}}
}
