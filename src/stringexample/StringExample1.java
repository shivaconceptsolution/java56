package stringexample;

public class StringExample1 {

	public static void main(String[] args) {
		String s = "hello";
	//	s = "world";
		s = s.concat("world");
		String s1 = new String("ram");
		String s2 = new String("ram");
		s2 = "ramnew";
		System.out.println(s);
		
		System.out.println("hello world");
		System.out.println(s.hashCode());
		String regex = "^(.+)@(.+)$";  
		String email="1@g.";
	    if(email.matches(regex))
	    {
	    	System.out.println("Valid email");
	    }
	    else
	    {
	    	System.out.println(" Not Valid email");
	   
	    }
	   

	    StringBuffer sb = new StringBuffer("hello");

	    sb.append("world");

	    System.out.println(sb);

	    StringBuilder sb1 = new StringBuilder("hello");

	    sb1.append("world");

	    System.out.println(sb1);
				

	}

}
