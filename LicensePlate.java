import java.util.Scanner;

public class LicensePlate {
  public static void main(String[] args) {
    String[] CODE = { "A", "B", "D", "E", "F", "G", "H", "L", "N", "T" };

    char[][] KOTA = {
        { 'B', 'A', 'N', 'T', 'E', 'N' },
        { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
        { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
        { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
        { 'B', 'O', 'G', 'O', 'R' },
        { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
        { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
        { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
        { 'M', 'A', 'L', 'A', 'N', 'G' },
        { 'T', 'E', 'G', 'A', 'L' }
    };

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter License Plate Code: ");
    String userCode = sc.next().toUpperCase();

    boolean found = false;
    for (int i = 0; i < CODE.length; i++) {
      if (CODE[i].equalsIgnoreCase(userCode)) {
        System.out.print("City: ");
        for (int j = 0; j < KOTA[i].length; j++) {
          System.out.print(KOTA[i][j]);
        }
        System.out.println();
        found = true;
        break;
      }
    }
    sc.close();

    if (!found) {
      System.out.println("Code not recognized.");
    }
  }
}