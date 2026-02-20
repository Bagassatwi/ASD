import java.util.Scanner;

public class LectureSchedule {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter number of lecture schedules (n): ");
    int n = Integer.parseInt(scanner.nextLine());

    String[][] schedule = new String[n][4];

    inputData(schedule);
    displayAll(schedule);

    System.out.print("\nEnter day to filter: ");
    displayByDay(schedule, scanner.nextLine());

    System.out.print("\nEnter course name to search: ");
    displayByCourse(schedule, scanner.nextLine());
  }

  public static void inputData(String[][] schedule) {
    for (int i = 0; i < schedule.length; i++) {
      System.out.println("\nEntry " + (i + 1));
      System.out.print("Course Name: ");
      schedule[i][0] = scanner.nextLine();
      System.out.print("Room       : ");
      schedule[i][1] = scanner.nextLine();
      System.out.print("Lecture Day: ");
      schedule[i][2] = scanner.nextLine();
      System.out.print("Lecture Time: ");
      schedule[i][3] = scanner.nextLine();
    }
  }

  public static void displayAll(String[][] schedule) {
    printHeader();
    for (String[] row : schedule) {
      printRow(row);
    }
  }

  public static void displayByDay(String[][] schedule, String day) {
    printHeader();
    for (String[] row : schedule) {
      if (row[2].equalsIgnoreCase(day)) {
        printRow(row);
      }
    }
  }

  public static void displayByCourse(String[][] schedule, String course) {
    printHeader();
    for (String[] row : schedule) {
      if (row[0].equalsIgnoreCase(course)) {
        printRow(row);
      }
    }
  }

  private static void printHeader() {
    System.out.println("\n-------------------------------------------------------------------------");
    System.out.printf("%-20s | %-15s | %-10s | %-15s\n", "Course Name", "Room", "Day", "Hours");
    System.out.println("-------------------------------------------------------------------------");
  }

  private static void printRow(String[] row) {
    System.out.printf("%-20s | %-15s | %-10s | %-15s\n", row[0], row[1], row[2], row[3]);
  }
}