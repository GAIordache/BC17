package io7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		File file = new File("pufi1.txt");

		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
		for(int i=0;i < 100;i++) {
			osw.write("Ala bala\n");
			osw.write("\n");
		}
		osw.close();
		
		
		
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(file), "UTF-8"));
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}

}
