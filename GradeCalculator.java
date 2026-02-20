import java.util.Scanner;

public class GradeCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Final Score Calculator");
    System.out.println("======================");

    System.out.print("Enter Assignment score: ");
    double assignment = sc.nextDouble();
    System.out.print("Enter Quiz score: ");
    double quiz = sc.nextDouble();
    System.out.print("Enter UTS score: ");
    double uts = sc.nextDouble();
    System.out.print("Enter UAS score: ");
    double uas = sc.nextDouble();
    System.out.println("======================");

    if (isValid(assignment) && isValid(quiz) && isValid(uts) && isValid(uas)) {
      double finalScore = (assignment * 0.2) + (quiz * 0.2) + (uts * 0.3) + (uas * 0.3);
      System.out.println("========Results=======");
      processResults(finalScore);
      System.out.print("======================");
    } else {
      System.out.println("invalid value");
    }
    sc.close();

  }

  private static boolean isValid(double val) {
    return val >= 0 && val <= 100;
  }

  private static void processResults(double n) {
    String letterGrade;
    String status;

    if (n > 80) {
      letterGrade = "A";
      status = "PASS";
    } else if (n > 73) {
      letterGrade = "B+";
      status = "PASS";
    } else if (n > 65) {
      letterGrade = "B";
      status = "PASS";
    } else if (n > 60) {
      letterGrade = "C+";
      status = "PASS";
    } else if (n > 50) {
      letterGrade = "C";
      status = "PASS";
    } else if (n > 39) {
      letterGrade = "D";
      status = "NOT PASS";
    } else {
      letterGrade = "E";
      status = "NOT PASS";
    }
    System.out.printf("Final Grade: %.2f\n", n);
    System.out.println("Letter Grade: " + letterGrade);
    System.out.println("Status: " + status);
  }
}