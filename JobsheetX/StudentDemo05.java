import java.util.Scanner;

public class StudentDemo05 {
  public static void main(String[] args) {
    StudentAssignmentStack05 stack = new StudentAssignmentStack05(5);
    Scanner sc = new Scanner(System.in);
    int choice;

    do {
      System.out.println("\nMenu:");
      System.out.println("1. Mengumpulkan Tugas");
      System.out.println("2. Menilai Tugas");
      System.out.println("3. Melihat Tugas Teratas");
      System.out.println("4. Melihat Daftar Tugas");
      System.out.println("5. View First Submitter");
      System.out.print("Pilih: ");
      choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
          System.out.print("Nama: ");
          String nama = sc.nextLine();
          System.out.print("NIM: ");
          String nim = sc.nextLine();
          System.out.print("Kelas: ");
          String kelas = sc.nextLine();
          Student05 mhs = new Student05(nim, nama, kelas);
          stack.push(mhs);
          System.out.printf("%s's assignment has been successfully submitted!!\n", mhs.name);
          break;
        case 2:
          Student05 graded = stack.pop();
          if (graded != null) {
            System.out.println("Grading assignment from " + graded.name);
            System.out.print("Input grade (0-100): ");
            int grade = sc.nextInt();
            graded.grading(grade);
            System.out.printf("Assignment grade of %s is %d\n", graded.name, grade);
            String binary = stack.convertToBinary(grade);
            System.out.printf("Assignment grade in binary is %s\n", binary);
          }
          break;
        case 3:
          Student05 seeLast = stack.peek();
          if (seeLast != null) {
            System.out.println("Tugas terakhir dikumpulkan oleh " + seeLast.name);
          }
          break;
        case 4:
          System.out.println("Daftar semua tugas");
          System.out.println("Nama\tNIM\tKelas");
          stack.print();
          break;
        case 5:
          Student05 seeFirst = stack.peekBottom();
          if (seeFirst != null) {
            System.out.println("Tugas terakhir dikumpulkan oleh " + seeFirst.name);
          }
          break;
        default:
          System.out.println("Pilihan tidak valid.");
      }
    } while (choice >= 1 && choice <= 5);
  }
}