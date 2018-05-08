package io1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws IOException {
		File dir = new File("mydir");
		if (!dir.isDirectory()) {
			if (!dir.mkdirs()) {
				throw new RuntimeException("Eroare creare director");
			}
		}
		Random rnd = new Random();
		int bytesToWrite = rnd.nextInt(30) + 10;
		File myFile = new File(dir, "test.bin");
		OutputStream os = new FileOutputStream(myFile);
		for (int i = 0; i < bytesToWrite; i++) {
			os.write('A');
		}
		os.close();

		InputStream is = new FileInputStream(myFile);
		int readValue = 0;
		int cnt = 0;
		readValue = is.read();
		while (readValue != -1) {
			cnt++;
			System.out.print((char) readValue);
			readValue = is.read();
		}
		System.out.println("\nFile size:" + cnt);
		
		is.close();
	}

}
