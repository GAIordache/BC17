package io5;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class MainDecompress {
	public static void main(String[] args) throws IOException {
		File sourceFile = new File("mydir/SP.zip");
		File destFile = new File("SP_UNC.pdf");
		InputStream is = null;
		OutputStream os = null;
		try {
			long startTime = System.nanoTime();
			is = new GZIPInputStream(new BufferedInputStream(new FileInputStream(sourceFile)));
			os = new FileOutputStream(destFile);
			byte[] buffer = new byte[4096];
			int nread = is.read(buffer);
			while (nread != -1) {
				os.write(buffer, 0, nread);
				nread = is.read(buffer);
			}
			long endTime = System.nanoTime();
			double duration = (endTime - startTime) / 1000000000.0;
			System.out.println("Duration:" + duration);
		} finally {
			if (is != null) {
				is.close();
			}
			if (os != null) {
				os.close();
			}
		}
	}
}
