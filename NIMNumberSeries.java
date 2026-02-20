import java.util.Scanner;

public class NIMNumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your NIM: ");
        String nim = sc.next();

        int last2DigitsNIM = Integer.parseInt(nim.substring(nim.length() - 2));

        if (last2DigitsNIM < 10) {
            last2DigitsNIM += 10;
        }

        System.out.println("n = " + last2DigitsNIM);
        System.out.print("Output: ");

        for (int i = 1; i <= last2DigitsNIM; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("#");
            } else if (i % 2 == 0) {
                System.out.print(i);
            } else {
                System.out.print("*");
            }

        }
        sc.close();
    }
}