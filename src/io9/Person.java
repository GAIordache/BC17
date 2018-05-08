package io9;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1324709302115073885L;
	
	private String mName;
	private transient int mAge;

	public Person(String pName, int pAge) {
		super();
		mName = pName;
		mAge = pAge;
	}

	public String getName() {
		return mName;
	}

	public void setName(String pName) {
		mName = pName;
	}

	public int getAge() {
		return mAge;
	}

	public void setAge(int pAge) {
		mAge = pAge;
	}

	@Override
	public String toString() {
		return "Person [mName=" + mName + ", mAge=" + mAge + "]";
	}
	
	

}
