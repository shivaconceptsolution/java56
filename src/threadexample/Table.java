package threadexample;

public class Table {
 synchronized void displayTable(int num)
 {
	 for(int i=1;i<=10;i++)
	 {
		
		 try {
			 System.out.println(num*i + " "+Thread.currentThread().getName());
			 if(i<5)
			 {
			
		      Thread.sleep(1000);
			 }
			 else
			 {
				
				 wait(1000);
				 notify();
			 }
			// wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
 }
}
