package com.std;

public class Student {

	private int stdID;
	private String Name;
	private double marks;

	public Student(int stdID, String name, double marks) {
		super();
		this.stdID = stdID;
		Name = name;
		this.marks = marks;
	}

	public int getStdID() {
		return stdID;
	}

	public void setStdID(int stdID) {
		this.stdID = stdID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	
	public void Display() {
		System.out.println("Student [stdID=" + stdID + ", Name=" + Name + ", marks=" + marks + "]");
	}

}
