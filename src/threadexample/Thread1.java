package threadexample;

public class Thread1 extends Thread {
   Table obj;
   Thread1(Table obj)
   {
	   this.obj=obj;
   }
   public void run()
   {
	  obj.displayTable(5);
   }
}
