package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingExampleNew {

	public static void main(String[] args) throws IOException {
		File f = new File("d://stu.doc");
		if(!f.exists())
		{
			f.createNewFile();
		
		}
		FileOutputStream fo = new FileOutputStream(f,true);
		String s = "hello world";
		byte arr[] = s.getBytes();
		fo.write(arr);
		fo.close();

	}

}
