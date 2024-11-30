package com.example.beansexample;

public class Institute {
	private Student student;
	
	public void setStudent(Student student) {
		this.student = student;
	}
	public void displayDetails() {
		System.out.println("Student: " + student.getName());
	}
}
