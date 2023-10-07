package collectionexample;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		//PriorityQueue<String> obj = new PriorityQueue<String>();
	//	Queue<String> obj = new PriorityQueue<String>();
		Deque<String> obj = new ArrayDeque<String>();
		obj.add("12");
		obj.add("23");
		obj.add("34");
		obj.addFirst("10");
		obj.addLast("66");
		//obj.offer("101");
	//	System.out.println("Top element"+obj.poll());
	 //	System.out.println("Top element"+obj.peek());
		while(obj.size()!=0)
		{
			System.out.println(obj.pop());
		}
		

	}

}
