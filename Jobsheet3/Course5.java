package Jobsheet3;

import java.util.Scanner;

public class Course5 {
  String code;
  String name;
  int credits;
  int totalHours;

  public Course5() {
  }

  public Course5(String code, String name, int credits, int totalHours) {
    this.code = code;
    this.name = name;
    this.credits = credits;
    this.totalHours = totalHours;
  }

  void addData(Scanner sc) {
    System.out.print("Code         : ");
    this.code = sc.nextLine();
    System.out.print("Name         : ");
    this.name = sc.nextLine();
    System.out.print("Credits      : ");
    this.credits = Integer.parseInt(sc.nextLine());
    System.out.print("Total Hours  : ");
    this.totalHours = Integer.parseInt(sc.nextLine());
    System.out.println("------------------------------------");
  }

  void printInfo() {
    System.out.println("Code         : " + code);
    System.out.println("Name         : " + name);
    System.out.println("Credits      : " + credits);
    System.out.println("Total Hours  : " + totalHours);
    System.out.println("------------------------------------");
  }
}