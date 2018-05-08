package io6;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class MemoryStreamIO {

	public static void main(String[] args) throws IOException {
		String content = "Ala bala portocala, bla bla";
		InputStream is = new ByteArrayInputStream(content.getBytes());
		int value = is.read();
		while (value != -1) {
			System.out.println((char) (byte) value);
			value = is.read();
		}
		is.close();
		
		OutputStream os = new ByteArrayOutputStream();
		for(int i=0;i < 10;i++) {
			os.write('A' + i);
		}
		os.close();
		byte[] values = ((ByteArrayOutputStream)os).toByteArray();
		System.out.println(Arrays.toString(values));
	}

}
