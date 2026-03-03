package Jobsheet3;

import java.util.Scanner;

public class LecturerDemo5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of lecturers: ");
    int count = Integer.parseInt(sc.nextLine());

    Lecturer5[] arrayOfLecturer = new Lecturer5[count];

    for (int i = 0; i < count; i++) {
      System.out.println("Enter Lecturer Data #" + (i + 1));
      System.out.print("Code           : ");
      String code = sc.nextLine();
      System.out.print("Name           : ");
      String name = sc.nextLine();
      System.out.print("Gender (M/F)   : ");
      String genderInput = sc.nextLine();
      boolean gender = genderInput.equalsIgnoreCase("M");
      System.out.print("Age            : ");
      int age = Integer.parseInt(sc.nextLine());
      System.out.println("------------------------------------");

      arrayOfLecturer[i] = new Lecturer5(code, name, gender, age);
    }

    System.out.println("\nDISPLAYING LECTURER DATA");
    System.out.println("========================");
    for (Lecturer5 lec : arrayOfLecturer) {
      System.out.println("Code    : " + lec.code);
      System.out.println("Name    : " + lec.name);
      System.out.println("Gender  : " + (lec.gender ? "Male" : "Female"));
      System.out.println("Age     : " + lec.age);
      System.out.println("------------------------------------");
    }

    LecturerData5 dataManager = new LecturerData5();
    dataManager.allLecturerData(arrayOfLecturer);
    dataManager.numberOfLecturersPerGender(arrayOfLecturer);
    dataManager.averageAgeOfLecturersPerGender(arrayOfLecturer);
    dataManager.oldestLecturerInfo(arrayOfLecturer);
    dataManager.youngestLecturerInfo(arrayOfLecturer);
  }
}