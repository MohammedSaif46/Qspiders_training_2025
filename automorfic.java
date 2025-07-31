package Upcasting;
public class automorfic {
public static void main (String[] args) {
			int num=25;
			int square=num*num;
			int temp=num;
			int digit=0;
			while(temp>0) {
				digit=digit+1;
				temp=temp/10;
			}
			int mod=1;
			for(int i=1;i<=digit;i++) {
				mod=mod*10;
			}
			int last=square%mod;
			if(last==num) {
				System.out.println(last+" it is a automorphic number");
			}
			else {
				System.out.println(last+" it is not a automorphic number");		
}
}
}