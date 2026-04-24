import java.util.Scanner;

public class ExcuseLetterDemo05 {
  public static void main(String[] args) {
    boolean isRunning = true;
    Scanner sc = new Scanner(System.in);
    ExcuseLetterStack05 stack = new ExcuseLetterStack05(67);
    stack.push(new ExcuseLetter05("2026001", "Alice", "10-A", 'S', 2));
    stack.push(new ExcuseLetter05("2026002", "Bob", "12-C", 'I', 1));
    stack.push(new ExcuseLetter05("2026003", "Charlie", "11-B", 'S', 3));
    stack.push(new ExcuseLetter05("2026004", "Diana", "10-A", 'I', 5));
    stack.push(new ExcuseLetter05("2026005", "Evan", "12-F", 'S', 1));
    while (isRunning) {
      System.out.println("\n1. Submit Excuse Letter");
      System.out.println("2. Process Excuse Letter");
      System.out.println("3. View Latest Excuse Letter");
      System.out.println("4. Search For Excuse Letter");
      int choice = Integer.parseInt(sc.nextLine());
      boolean isS;
      String Type;
      switch (choice) {
        case 1:
          System.out.print("NIM: ");
          String NIM = sc.nextLine();
          System.out.print("Name: ");
          String name = sc.nextLine();
          System.out.print("Class: ");
          String className = sc.nextLine();
          char typeOfExcuse;
          do {
            System.out.print("Type Of Excuse (S = Sick, I = Others): ");
            typeOfExcuse = sc.nextLine().charAt(0);
            System.out.println("skib" + typeOfExcuse);
          } while (typeOfExcuse != 'S' && typeOfExcuse != 's' && typeOfExcuse != 'i' && typeOfExcuse != 'I');
          System.out.print("Duration: ");
          int duration = Integer.parseInt(sc.nextLine());
          ExcuseLetter05 temp = new ExcuseLetter05(NIM, name, className, typeOfExcuse, duration);
          stack.push(temp);
          break;
        case 2:
          ExcuseLetter05 letter = stack.pop();
          if (letter == null) {
            break;
          }
          isS = letter.typeOfExcuse == 's' || letter.typeOfExcuse == 'S';
          Type = isS ? "(Sick)" : "(Others)";
          System.out.printf("Processing Excuse Letter From %s \n", letter.name);
          System.out.printf("NIM: %s \n", letter.id);
          System.out.printf("Name: %s \n", letter.name);
          System.out.printf("Class: %s  \n", letter.className);
          System.out.printf("Type: %c %s \n", letter.typeOfExcuse, Type);
          System.out.printf("Duration: %d \n", letter.duration);
          System.out.printf("Excuse Letter From %s is Verified!\n", letter.name);
          break;
        case 3:
          ExcuseLetter05 data = stack.peek();
          if (data == null) {
            break;
          }
          isS = data.typeOfExcuse == 's' || data.typeOfExcuse == 'S';
          Type = isS ? "(Sick)" : "(Others)";
          System.out.printf("NIM: %s \n", data.id);
          System.out.printf("Name: %s \n", data.name);
          System.out.printf("Class: %s  \n", data.className);
          System.out.printf("Type: %c %s \n", data.typeOfExcuse, Type);
          System.out.printf("Duration: %d \n", data.duration);
          break;
        case 4:
          System.out.printf("Search Excuse Letter For A Student Name: ");
          boolean found = false;
          String nameToSearch = sc.nextLine();
          for (int i = 0; i <= stack.top; i++) {
            if (stack.stack[i].name.equalsIgnoreCase(nameToSearch)) {
              isS = stack.stack[i].typeOfExcuse == 's' || stack.stack[i].typeOfExcuse == 'S';
              Type = isS ? "(Sick)" : "(Others)";
              System.out.printf("NIM: %s \n", stack.stack[i].id);
              System.out.printf("Name: %s \n", stack.stack[i].name);
              System.out.printf("Class: %s  \n", stack.stack[i].className);
              System.out.printf("Type: %c %s \n", stack.stack[i].typeOfExcuse, Type);
              System.out.printf("Duration: %d \n", stack.stack[i].duration);
              found = true;
              System.out.println("Data Found At queue: " + (stack.top - i));
              break;
            }
          }
          if (!found)
            System.out.println("Data Not Found!");
          break;
        default:
          System.out.println("Please Select 1 - 4");
          break;
      }
    }
  }
}
