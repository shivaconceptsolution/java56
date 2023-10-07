package threadexample;

public class Thread2 extends Thread {
	   Table obj;
	   Thread2(Table obj)
	   {
		   this.obj=obj;
	   }
	   public void run()
	   {
		  obj.displayTable(9);
	   }
}
