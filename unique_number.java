package Upcasting;
public class unique_number {
		public static void main(String[] args) {
			int num=1234;
			int original=num;
			boolean isUnique=true;
			for(int i =0;i<10;i++) {
				int count=0;
				int temp=num;
				while (temp>0) {
					int digit=temp%10;
					if(digit==i) {
						count++;
					}
					temp=temp/10;
				}
				if(count>1) {
					isUnique=false;
					break;
				}
			}
			if(isUnique) {
				System.out.println(original+" is a unique number");
			}
			else {
				System.out.println(original+" is not a unique number");
			}
		}}

	


