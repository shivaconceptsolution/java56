package threadexample;

public class ThreadImplementation {

	public static void main(String[] args) throws IllegalThreadStateException {
		Table obj = new Table();
		Thread1 t1 = new Thread1(obj);
		t1.start();
		//t1.setDaemon(true);
		Thread2 t2 = new Thread2(obj);
		
		t2.start();
	}

}
