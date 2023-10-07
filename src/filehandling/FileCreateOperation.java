package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreateOperation {

	public static void main(String[] args) throws IOException {
		String name="manish kumar";
		String email="manishkumar@gmail.com";
		String dob="10-06-1997";
		File f = new File("d://hello1.doc");
		if(!f.exists())
		{
			f.createNewFile();
		
		}
		FileWriter fw = new FileWriter(f); //append mode
		BufferedWriter bw =new BufferedWriter(fw);
		bw.write("name is "+name);
		bw.newLine();
		bw.write("email id is "+email);
		bw.newLine();
		bw.write("dob is "+dob);
		bw.close();
		fw.close();
		System.out.println("File Written Successfully");
		

	}

}
