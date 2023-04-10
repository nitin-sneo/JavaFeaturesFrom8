package java8;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "Hello World";
//		s1 = "Hello World1";
		String s3 = new String("Hello World");
		s3=s3.intern();
		String s1 = new String("Hello World");
		String s2 = s3;
		
		
		         
	
		if(s2 == s3)
			System.out.println("s1==s3 "+ "True"+s1.hashCode()+" "+s3.hashCode());
		else
			System.out.println("s1==s3 "+"False"+s1.hashCode()+" "+s3.hashCode());

	}

}
