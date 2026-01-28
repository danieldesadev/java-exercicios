package application;

import entities.Student;

import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();
        student.note1 = sc.nextDouble();
        student.note2 = sc.nextDouble();
        student.note3 = sc.nextDouble();

        System.out.println("FINAL GRADE= " + student.finalnote());
        if (student.finalnote()>=60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + student.missingnote() + " POINTS");
        }

    }
}
