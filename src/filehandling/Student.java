package filehandling;

import java.io.Serializable;

public class Student implements Serializable {
	int rno;
	transient String sname;
	Student(int rno,String sname)
	{
		this.rno=rno;
		this.sname=sname;
	}
	public String toString()
	{
		return "rno is "+rno + " name is "+sname;
	}

}
