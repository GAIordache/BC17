package io4;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		File sourceFile = new File("E:\\Apia2015_1.tgz");
		InputStream is = null;
		try {
			long sum = 0;
			long startTime = System.nanoTime();
			is = new BufferedInputStream(new FileInputStream(sourceFile));
			int readValue = is.read();
			while (readValue != -1) {
				sum += readValue;
				readValue = is.read();
			}
			long endTime = System.nanoTime();
			double duration = (endTime - startTime) / 1000000000.0;
			System.out.println("Duration:" + duration + " sum:" + sum);
		} finally {
			if (is != null) {
				is.close();
			}

		}
	}

}
