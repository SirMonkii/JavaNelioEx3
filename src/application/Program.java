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

		System.out.printf("FINAL GRADE: %.2f%n", std.finalGrade());

		if (std.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", std.missingPoints());

		} else {
			System.out.println("PASS");

		}

		sc.close();
	}

}
