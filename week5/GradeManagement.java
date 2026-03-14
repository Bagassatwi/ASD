package week5;

public class GradeManagement {
  static Student5[] list = {
      new Student5("Ahmad", 78, 82),
      new Student5("Budi", 85, 88),
      new Student5("Cindy", 90, 87),
      new Student5("Dian", 76, 79),
      new Student5("Eko", 92, 95),
      new Student5("Fajar", 88, 85),
      new Student5("Gina", 80, 3),
      new Student5("Hadi", 82, 4)
  };

  public static int findMaxUTS(int l, int r) {
    if (l == r) {
      return list[l].uts;
    }
    int mid = (l + r) / 2;
    int leftMax = findMaxUTS(l, mid);
    int rightMax = findMaxUTS(mid + 1, r);

    return (leftMax > rightMax) ? leftMax : rightMax;
  }

  public static int findMinUTS(int l, int r) {
    if (l == r) {
      return list[l].uts;
    }
    int mid = (l + r) / 2;
    int leftMin = findMinUTS(l, mid);
    int rightMin = findMinUTS(mid + 1, r);

    return (leftMin < rightMin) ? leftMin : rightMin;
  }

  public static double calculateAvgUAS() {
    double total = 0;
    for (int i = 0; i < list.length; i++) {
      total += list[i].uas;
    }
    return total / list.length;
  }

  public static void main(String[] args) {
    System.out.println("Highest Midterm Score (UTS): " + findMaxUTS(0, list.length - 1));
    System.out.println("Lowest Midterm Score (UTS): " + findMinUTS(0, list.length - 1));
    System.out.println("Average Final Score (UAS): " + calculateAvgUAS());
  }
}