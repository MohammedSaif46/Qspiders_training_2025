package qspiders;

public class Fibbonaci {
	public static void main(String[] args) {
int num=8;
		int firstnum=0;
	    int Lastnum=1;
	    int result=0;
	    for(int i=0;i<=num;i++) {
	    	result=firstnum+Lastnum;
	    	firstnum=Lastnum;
	    	Lastnum=result;
System.out.println(result);
}	}
}
