package collectionexample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
	//	LinkedList obj = new LinkedList();
	//	ArrayList<String> obj = new ArrayList<String>();
		Vector<String> obj = new Vector<String>();
		obj.add("C");
		obj.add("C++");
		obj.add("DS");
		obj.add("PHP");
		//obj.addFirst("BASIC COMPUTER");
		//obj.addLast("DATA STRUCTURE");
		//obj.add(101);
		//obj.add(true);
	//	obj.remove(1);
	//	obj.removeFirst();
		obj.add(1,"PYTHON");
		for(int i=0;i<obj.size();i++)
		{
			 System.out.println(obj.get(i));
		}
		
	    for(Object o:obj)
		{
			    System.out.println(o);
		}
		

	}

}
