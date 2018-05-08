package io8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {
	public static void main(String[] pArgs) throws IOException {
		DataOutputStream dataOS = new DataOutputStream(new FileOutputStream(new File("test.dat")));
		dataOS.writeBoolean(false);
		dataOS.writeInt(314);
		dataOS.writeDouble(3.14);
		dataOS.close();
		
		DataInputStream dataIS = new DataInputStream(new FileInputStream(new File("test.dat")));
		System.out.println(dataIS.readBoolean());
		System.out.println(dataIS.readInt());
		System.out.println(dataIS.readDouble());
		dataIS.readLong();

		dataIS.close();;
	}
}
