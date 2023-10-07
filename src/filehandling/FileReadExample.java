package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("d://hello1.txt");
		BufferedReader br = new BufferedReader(fr);
		String res="",s="";
		while((s=br.readLine())!=null)
		{
			res = res +s + "\n";
		}
		System.out.println(res);
		fr.close();

	}

}
