import java.util.Scanner;

public class GPACalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] courses = { "Pancasila", "KTI", "CTPS", "Basic Math", "English",
        "Basic Programming", "Basic Programming Practicum", "K3" };
    int totalCourse = courses.length;
    double[] courseGrades = new double[totalCourse];
    double[] gradeNumberEquivalent = new double[totalCourse];
    String[] gradeLetterEquivalent = new String[totalCourse];
    double totalGradeEquivalent = 0;

    System.out.println("--- GPA Calculator ---");
    for (int i = 0; i < totalCourse; i++) {
      double score = 0;
      do {
        System.out.print("Enter grade for course " + courses[i] + ": ");
        score = sc.nextDouble();
        if (score > 100 || score < 0) {
          System.out.println("Score must be from 0 to 100");
        }
      } while (score > 100 || score < 0);

      courseGrades[i] = score;
      double equivalent = getWeightedEquivalent(score);
      gradeNumberEquivalent[i] = equivalent;
      totalGradeEquivalent += equivalent;
      gradeLetterEquivalent[i] = getLetterEquivalent(score);
    }

    System.out.println("====Grade Conversion Result====");
    System.out.printf("%-30s %-15s %-15s %-10s\n", "Course Name", "Number Grade",
        "Letter Grade", "Weighted Grade");
    for (int i = 0; i < totalCourse; i++) {
      System.out.printf("%-30s %-15.2f %-15s %-10s\n", courses[i], courseGrades[i], gradeLetterEquivalent[i],
          gradeNumberEquivalent[i]);
    }

    double GPA = totalGradeEquivalent / totalCourse;
    System.out.println("===============================");
    System.out.println("GPA: " + GPA);
    sc.close();
  }

  private static double getWeightedEquivalent(double n) {
    if (n > 80)
      return 4.0;
    if (n > 73)
      return 3.5;
    if (n > 65)
      return 3.0;
    if (n > 60)
      return 2.5;
    if (n > 50)
      return 2.0;
    if (n > 39)
      return 1.0;
    return 0.0;
  }

  private static String getLetterEquivalent(double n) {
    if (n > 80)
      return "A";
    else if (n > 73)
      return "B+";
    else if (n > 65)
      return "B";
    else if (n > 60)
      return "C+";
    else if (n > 50)
      return "C";
    else if (n > 39)
      return "D";
    return "E";
  }

}