package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputSteramReaderExample {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("d://story.doc");
		BufferedWriter bw = new BufferedWriter(fw);
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("Enter story");
		String data = br.readLine();
	
		bw.write(data);
		System.out.println("story created");
		bw.close();
	}

}
