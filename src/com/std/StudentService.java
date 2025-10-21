package com.std;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {

	private Scanner sc = new Scanner(System.in);

	private ArrayList<Student> Student = new ArrayList<>();

	public void AddStudent() {
		System.out.println("Enter Student ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name: ");
		String name = sc.next();
		sc.nextLine();
		System.out.println("Enter Student Marks: ");
		double marks = sc.nextDouble();

		Student.add(new Student(id, name, marks));
		System.out.println("Student data added Succesfully.....");
	}

	public void ViewStudent() {
		if (Student.isEmpty()) {
			System.out.println("No record Found!....");
		} else {
			System.out.println("---Student List---");
			for (Student s : Student) {
				s.Display();;
			}
		}
	}

	public void updateStudent() {
		System.out.println("Enter student ID to updates: ");
        int id = sc.nextInt();
		
		for(Student s : Student) {
			if(s.getStdID() == id) {
				System.out.println("Enter new Student name: ");
				String newName = sc.next();
				System.out.println("Enter new Student Marks: ");
				double newMarks = sc.nextDouble();
				
				s.setName(newName);
				s.setMarks(newMarks);
				
				System.out.println("Student imformation updated succesfully.....!");
				return;
			}
		}
		System.out.println("Student Not Found....!");
	}
	
	public void DeleteStudent() {
		System.out.println("Enter Student ID to Delete: ");
		int id = sc.nextInt();
		
		for(Student s : Student) {
			if(s.getStdID() == id) {
				Student.remove(s);
				System.out.println("Student record deleted succesfully......");
				return;	
			}
		}
		System.out.println("Student Not Found.....!");
		sc.close();
	}
}
