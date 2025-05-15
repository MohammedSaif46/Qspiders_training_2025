package suuuuui;

public class Reverse {
	public static void main(String[] args) {
		int num=1124;
		int rev=0;
		while(num>0) {
			int Inum =num%10;
			rev=rev*10+Inum;
			num=num/10;
		}
	System.out.println(rev);
	}
}
