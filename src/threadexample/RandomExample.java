package threadexample;

public class RandomExample extends Thread {
	
	int max = 6;
    int min = 1;
    String user;
    static int arr[] = new int[2];
    static int index=0;
    RandomExample(String user)
    {
    	this.user=user;
    	
    }
    public void run()
    {
    	
        int range = max - min + 1;
        int total=0;
        // generate random numbers within 1 to 10
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;
            if(rand==5)
            {
            	
            	continue;
            }
            total+=rand;
           
           
            // Output is different everytime this code is executed
            System.out.println("score of "+user + rand +  " run ");
        }
        arr[index++]=total;
        System.out.println("Total Score of user  "+total);
    }
    
    static void winner()
    {
    	System.out.println(arr[0]>arr[1]?"First Player is Winner ":"Second Player is Winner");
    }
    
	public static void main(String[] args) throws InterruptedException {
	
		RandomExample obj = new RandomExample("Virat Kohli");
		obj.start();
		obj.join();
		RandomExample obj1 = new RandomExample("Rohit Sharma");
		obj1.start();
		obj1.join();
		winner();
		
		
		
	}

}
