package Jobsheet6;

import java.util.Scanner;

public class LecturerDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LecturerData5 data = new LecturerData5();
        int menu;

        do {
            System.out.println("\n--- Lecturer Management System ---");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (Youngest to Oldest)");
            System.out.println("4. Sort DSC (Oldest to Youngest)");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Gender (true=Male, false=Female): ");
                    boolean gender = sc.nextBoolean();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    data.add(new Lecturer5(id, name, gender, age));
                    break;
                case 2:
                    System.out.println("\n--- All Lecturer Data ---");
                    data.print();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Sorted by age (Ascending).");
                    data.print();
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Sorted by age (Descending).");
                    data.print();
                    break;
            }
        } while (menu != 5);
        sc.close();
    }
}