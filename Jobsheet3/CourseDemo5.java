package Jobsheet3;

import java.util.Scanner;

public class CourseDemo5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of courses you want to add: ");
    Course5[] arrayOfCourse = new Course5[Integer.parseInt(sc.nextLine())];
    System.out.println();

    for (int i = 0; i < arrayOfCourse.length; i++) {
      arrayOfCourse[i] = new Course5();
      System.out.println("Enter Course Data #" + (i + 1));
      arrayOfCourse[i].addData(sc);
    }

    for (int i = 0; i < arrayOfCourse.length; i++) {
      System.out.println("Data Course #" + (i + 1));
      arrayOfCourse[i].printInfo();
    }
  }
}