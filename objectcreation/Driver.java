package objectcreation;

public class Driver {
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1);
		Student s2 =new Student();
		System.out.println(s2);
		System.out.println(s1==s2);//false
	}

}


