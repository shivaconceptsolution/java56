package collectionexample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		HashSet<String> obj = new HashSet<String>();
	//	TreeSet<String> obj = new TreeSet<String>();
	//	LinkedHashSet<String> obj = new LinkedHashSet<String>();
		obj.add("Apple");    //Adding elements  
		obj.add("Banana");      
		obj.add("Dog");    
		obj.add("Elephant"); 
		obj.add("Cat");     
		for(Object o:obj)
		{
			System.out.println(o);
		}

	}

}
