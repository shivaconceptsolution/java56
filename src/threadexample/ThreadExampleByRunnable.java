package threadexample;

public class ThreadExampleByRunnable extends Table implements Runnable{
    int num;
	public ThreadExampleByRunnable(int num) {
    	this.num=num;
	}
	@Override
	public void run() {
		  for(int i=1;i<=10;i++)
          {
         	  
         	 try {
         		 System.out.println("Process "+i + Thread.currentThread().getName()); 
         		 
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
				}
          }
		  this.displayTable(num);
		
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadExampleByRunnable obj = new ThreadExampleByRunnable(5);
        
		ThreadExampleByRunnable obj1 = new ThreadExampleByRunnable(9);
		Thread t = new Thread(obj);
        t.start();
        t.join();
        Thread t1 = new Thread(obj1);
        t1.start();

	}

}
