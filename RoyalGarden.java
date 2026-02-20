public class RoyalGarden {

  public static void main(String[] args) {
    int[][] stock = {
        { 10, 5, 15, 7 },
        { 6, 11, 9, 12 },
        { 2, 10, 10, 5 },
        { 5, 7, 12, 9 }
    };

    int[] prices = { 75000, 50000, 60000, 10000 };
    String[] branches = { "RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4" };

    displayBranchIncomeAndStatus(stock, prices, branches);
  }

  public static void displayBranchIncomeAndStatus(int[][] stock, int[] prices, String[] branches) {
    System.out.printf("%-15s | %-15s | %-15s%n", "Branch", "Total Income", "Status");
    System.out.println("-------------------------------------------------------------");

    for (int i = 0; i < stock.length; i++) {
      long totalIncome = 0;

      for (int j = 0; j < stock[i].length; j++) {
        totalIncome += (long) stock[i][j] * prices[j];
      }

      String status = (totalIncome > 1500000) ? "Very Good" : "Need Evaluation";

      System.out.printf("%-15s | IDR %-11d | %-15s%n", branches[i], totalIncome, status);
    }
  }
}