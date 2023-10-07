package collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GeneriCollection {

	public static void main(String[] args) {
		List<Student> obj = new ArrayList<Student>();
		obj.add(new Student(1001,"stu1","CS",78000));
		obj.add(new Student(1003,"stu3","IT",89000));
		obj.add(new Student(1005,"stu5","IT",29000));
		obj.add(new Student(1006,"stu4","IT",19000));
		obj.add(new Student(1002,"stu2","IT",9000));
	//	Collections.sort(obj,new FeesComparator());
		Collections.sort(obj,new RnoComparator());
		Iterator<Student> it = obj.iterator();
		while(it.hasNext())
		{
Student data =(Student)it.next();
System.out.println(data.rno+" "+data.sname+ " "+data.branch+ " "+data.fees);
		}
		

	}

}
