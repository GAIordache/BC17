package io7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) throws IOException {
		File file = new File("pufi.txt");
		Writer writer = new FileWriter(file);
		for(int i=0;i < 100;i++) {
			writer.write("Ala bala\n");
		}
		writer.close();
		char[] values = new char[1000];
		Reader reader = new FileReader(file);
		int nread = reader.read(values);
		System.out.println(new String(values,0,nread));
		
		reader.close();
	}

}
