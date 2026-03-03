package Jobsheet3;

import java.util.Scanner;

public class StudentDemo5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student5[] arrayOfStudent = new Student5[3];
    String dummy;

    for (int i = 0; i < 3; i++) {
      arrayOfStudent[i] = new Student5();

      System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
      System.out.print("NIM    : ");
      arrayOfStudent[i].nim = sc.nextLine();
      System.out.print("Name   : ");
      arrayOfStudent[i].name = sc.nextLine();
      System.out.print("Class  : ");
      arrayOfStudent[i].class_ = sc.nextLine();
      System.out.print("IPK    : ");
      dummy = sc.nextLine();
      arrayOfStudent[i].GPA = Float.parseFloat(dummy);
      System.out.println("------------------------------------");
    }

    for (int i = 0; i < 3; i++) {
      System.out.println("Data Mahasiswa ke-" + (i + 1));
      arrayOfStudent[i].printInfo();
    }
  }

}
