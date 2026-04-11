package jobsheet_7.jobsheet_7;

import java.util.Scanner;

public class MainStudent5 {
  public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    SearchStudent5 data = new SearchStudent5();
    int amountStudent = 5;

    System.out.println("------------------------------------");
    System.out.println("Input student data accordingly from smallest NIM");
    for (int i = 0; i < amountStudent; i++) {
      System.out.println("-----------");
      System.out.print("NIM\t:");
      int nim = sc1.nextInt();
      System.out.print("Name\t:");
      String name = sc2.nextLine();
      System.out.print("Age\t:");
      int age = sc1.nextInt();
      System.out.print("GPA\t:");
      double gpa = sc1.nextDouble();

      Students5 std = new Students5(nim, age, name, gpa);
      data.add(std);
    }

    System.out.println("------------------------------------");
    System.out.println("Entire Student Data");
    data.display();

    System.out.println("____________________________________");
    System.out.println("____________________________________");
    System.out.print("Search student by NIM: ");
    int search = sc1.nextInt();
    System.out.println("Using Sequential Search");
    int position = data.findSeqSearch(search);
    data.showPosition(search, position);
    data.showData(search, position);

    System.out.println("================================");
    System.out.print("Search student by NIM: ");
    System.out.println("Using binary Search");
    int position1 = data.findBinarySearch(search, 0, amountStudent - 1);
    data.showPosition(search, position1);
    data.showData(search, position1);
  }
}