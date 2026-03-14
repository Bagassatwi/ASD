package week5;

import java.util.Scanner;

public class BruteForceDivideConquer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input a number: ");
    int num = sc.nextInt();
    Factorial fk = new Factorial();
    System.out.println("The factorial of " + num + " using BF: " + fk.factorialBF(num));
    System.out.println("The factorial of " + num + " using DC: " + fk.factorialDC(num));
  }
}

class Factorial {
  int factorialBF(int n) {
    int facto = 1;
    for (int i = 1; i <= n; i++) {
      facto *= i;
    }
    return facto;
  }

  int factorialDC(int n) {
    if (n == 1) {
      return 1;
    } else {
      int facto = n * factorialDC(n - 1);
      return facto;
    }
  }
}