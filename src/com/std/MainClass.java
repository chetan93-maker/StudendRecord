package com.std;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentService();
		int choice = 0;
		
		do {
		System.out.println("---Welcome to Student Manggement System---");
		System.out.println("1. Add Student");
		System.out.println("2. View Student");
		System.out.println("3. Update Student");
		System.out.println("4. Delete Student");
		System.out.println("5. Exit the System");
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1: ss.AddStudent();
		break;
		case 2: ss.ViewStudent();
		break;
		case 3: ss.updateStudent();
		break;
		case 4: ss.DeleteStudent();
		break;
		case 5: System.out.println("Exit the system succesfully....");
		break;
		default: System.out.println("Invalid choice! try again please.....");
		}
	}while(choice != 5);

		sc.close();
	}

}