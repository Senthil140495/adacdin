package org.univ;

public class College extends University {
	
	public  College() {
		this(65);
		System.out.println("default constructor");	
	}
	
	public  College(String name) {
		this();
		System.out.println("string constructor");	
	}
	public College(int id) {
		super(65);
		System.out.println("int constructor");
	}
public static void main(String[] args) {
	
	
	new College();
	
	
	}
}
