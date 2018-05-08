package io7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class FileOutputWriterExample {

	public static void main(String[] args) throws IOException {
		File file = new File("pufi1.txt");

		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
		for(int i=0;i < 100;i++) {
			osw.write("Ala bala\n");
		}
		osw.close();
		char[] values = new char[1000];
		InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
		int nread = isr.read(values);
		System.out.println(new String(values,0,nread));
		isr.close();
		
	}

}
