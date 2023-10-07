package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student obj = new Student(1001,"stu1");
		FileOutputStream fo = new FileOutputStream("d://stuser.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(obj);
		oo.close();
		fo.close();
		FileInputStream fi = new FileInputStream("d://stuser.txt");
		ObjectInputStream ois = new ObjectInputStream(fi);
		Student s =(Student)ois.readObject();
		System.out.println(s);
		ois.close();
		fi.close();

	}

}
