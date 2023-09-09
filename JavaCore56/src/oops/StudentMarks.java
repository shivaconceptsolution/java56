package oops;

public class StudentMarks {
	int physics;
	int chemistry;
	int per;
   void accept(int physics,int chemistry)
   {
	   this.physics=physics;
	   this.chemistry=chemistry;
   }
   void calcResult()
   {
	    this.per = (physics+chemistry)/2;
	   
   }
   void display()
   {
	   System.out.println("Physics Marks is "+physics+ " Chemistry Marks is "+this.chemistry);
	   System.out.println("Percentage is "+per);
	   
   }
}
