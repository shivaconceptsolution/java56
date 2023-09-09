package oops;
import java.util.Scanner;
public class MarksMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter number of students");
		num=sc.nextInt();
		StudentMarks obj[] = new StudentMarks[num];
		int max=0;
		int index=0;
		for(int i=0;i<obj.length;i++)
		{
			obj[i] = new StudentMarks();
			System.out.println("Enter Physics Subject Marks");
			int p = sc.nextInt();
			System.out.println("Enter Chemistry Subject Marks");
			int c = sc.nextInt();
			obj[i].accept(p,c);
			obj[i].calcResult();
			obj[i].display();
			if(max<obj[i].per)
			{
				max=obj[i].per;
				index=i;
			}
			
			
		}
		System.out.println("Max Student Record is ");
		obj[index].display();
		
		

	}

}
