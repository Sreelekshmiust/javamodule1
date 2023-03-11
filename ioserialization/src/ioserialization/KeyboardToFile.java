package ioserialization;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardToFile {

	public static void main(String[] args) throws IOException {

		String data = null;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		FileWriter w = new FileWriter("Nammadefile.txt");
		
		
		System.out.println("enter some text..");
		data = reader.readLine();
		while (!data.equals("quit")) {
			//System.out.println("you have entered ..." + data);
			w.write(data);
			data = reader.readLine();
		}
		w.flush();
		w.close();
		reader.close();
		System.out.println("main ended");
	}
}
