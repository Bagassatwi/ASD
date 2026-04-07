package Jobsheet6;

import java.util.Scanner;

public class StudentDemo5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of students: ");
    int size = sc.nextInt();
    TopStudent5 topStudents = new TopStudent5(size);
    sc.nextLine();
    for (int i = 0; i < size; i++) {
      System.out.println("Student " + (i + 1));
      System.out.print("NIM: ");
      String nim = sc.nextLine();
      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("Class: ");
      String studentClass = sc.nextLine();
      System.out.print("GPA: ");
      double gpa = sc.nextDouble();
      sc.nextLine();
      topStudents.add(new Student5(nim, name, studentClass, gpa));
      System.out.println();
    }

    // Display original list
    System.out.println("Original student list:");
    topStudents.print();

    // Sorting students by GPA using Bubble Sort
    topStudents.bubbleSort();
    System.out.println("Sorted student list (by GPA, descending):");
    topStudents.print();

    // Sorting students by GPA using Selection Sort
    topStudents.selectionSort();
    System.out.println("Sorted student list (by GPA, ascending) Using Selection Sort:");
    topStudents.print();

    // Sorting students by GPA using Insertion Sort
    topStudents.insertionSort();
    System.out.println("Sorted student list (by GPA, descending) Using Insertion Sort:");
    topStudents.print();
  }
}