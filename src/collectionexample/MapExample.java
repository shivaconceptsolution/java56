package collectionexample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		  Map<String,Object> obj = new TreeMap<String,Object>();
		  obj.put("rno",1001);
		  obj.put("sname","stu1");
		  obj.put("branch","CS");
		  obj.put("fees",56000);
		  
		 Set<Map.Entry<String,Object>> st = obj.entrySet();
		 for(Map.Entry<String,Object> s:st)
		 {
			 System.out.println(s.getKey() + " " + s.getValue());
		 }

	}

}
