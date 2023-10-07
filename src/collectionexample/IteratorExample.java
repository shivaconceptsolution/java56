package collectionexample;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorExample {

	public static void main(String[] args) {
		Vector<String> obj = new Vector<String>();
		obj.add("C");
		obj.add("C++");
		obj.add("DS");
		obj.add("PHP");
		Iterator<String> it = obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		ListIterator<String> lt = obj.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		while(lt.hasPrevious())
		{
			System.out.println(lt.previous());
		}
	}

}
