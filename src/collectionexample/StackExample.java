package collectionexample;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> obj = new Stack<String>();
		obj.push("12");
		obj.push("32");
		obj.push("72");
		obj.push("1");
		while(obj.size()!=0)
		{
			System.out.println(obj.pop());
		}
		

	}

}
