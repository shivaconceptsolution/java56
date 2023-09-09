package oops;

public class ObjectInfo {
    static int count=0;
    ObjectInfo()
    {
    	count++;
    	if(count>2)
    	{
    		System.exit(0);
    	}
    	System.out.println(count + " Object Created");
    		
    }
	public static void main(String args[])
	{
		ObjectInfo obj1 = new ObjectInfo();
		
		ObjectInfo obj2 = new ObjectInfo();
		ObjectInfo obj3 = new ObjectInfo();
		
	}
}
