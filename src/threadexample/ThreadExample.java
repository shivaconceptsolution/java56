package threadexample;

public class ThreadExample extends Thread{
	public void run()   // running
    {
             for(int i=1;i<=10;i++)
             {
            	  
            	 try {
            		 System.out.println("Process "+i + Thread.currentThread().getName()); 
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
				}
             }
    }
	public static void main(String[] args) throws InterruptedException {
		ThreadExample obj = new ThreadExample();  //new state
		obj.setPriority(10);
		obj.start();
		
		ThreadExample obj1 = new ThreadExample();  //new state
		obj1.setPriority(1);
		obj1.start();
		
		
		
	}

}
