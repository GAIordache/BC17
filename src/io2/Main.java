package io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
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
		int bytesToWrite = rnd.nextInt(4096) + 1024;
		File myFile = new File(dir, "test.bin");
		OutputStream os = new FileOutputStream(myFile);
		byte[] buffer = new byte[bytesToWrite];
		Arrays.fill(buffer,(byte) 'A');
		os.write(buffer);
		os.close();

		InputStream is = new FileInputStream(myFile);
		byte[] readBuffer = new byte[512];
		
		int readCnt = 0;
		int cnt = 0;
		readCnt = is.read(readBuffer);
		while (readCnt != -1) {
			System.out.println("Read " + readCnt + " bytes");
			cnt += readCnt;
			//System.out.print(new String(readBuffer,0,0,readCnt));
			readCnt = is.read(readBuffer);
		}
		System.out.println("\nFile size:" + cnt);
		
		is.close();
	}

}
