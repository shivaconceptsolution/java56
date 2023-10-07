package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadOperationExample {

	public static void main(String[] args) throws IOException {
		File f = new File("d://stu.doc");
		if(!f.exists())
		{
			f.createNewFile();
		
		}
        FileInputStream fi = new FileInputStream(f);
        byte arr[] = new byte[15];
        while(fi.read(arr)!=-1)
        {
        	System.out.println(new String(arr));
        }
        fi.close();
	}

}
