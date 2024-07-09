package application;

import java.util.Scanner;

import entity.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		
		std.name = sc.next();
		std.grade1 = sc.nextDouble();
		std.grade2 = sc.nextDouble();
		std.grade3 = sc.nextDouble();
	
		
		if(std.finalGrade() >= 60) {
			
			System.out.println();
			System.out.println("FINAL GRADE = " + std.finalGrade());
			System.out.println("PASS");
			
		}else {
			
			System.out.println();
			System.out.println("FINAL GRADE = " + std.finalGrade());
			System.out.println("FAILED");
			System.out.println("MISSING " + (100 - std.finalGrade()) + " POINTS");
			
		}
		
		
		sc.close();
	}

}
