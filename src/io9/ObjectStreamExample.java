package io9;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p1 = new Person("Vasile", 22);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(p1);
		oos.close();
		byte[] content = baos.toByteArray();
		System.out.println(content.length);
		System.out.println(new String(content));
		
		ByteArrayInputStream bais  = new ByteArrayInputStream(content);
		ObjectInputStream ois = new ObjectInputStream(bais);
		Person p2 = (Person)ois.readObject();
		ois.close();
		System.out.println(p1 == p2);
		System.out.println(p2);
	}

}
