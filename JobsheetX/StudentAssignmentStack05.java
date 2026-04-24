public class StudentAssignmentStack05 {
  Student05[] stack;
  int top, size;

  StudentAssignmentStack05(int size) {
    this.size = size;
    top = -1;
    stack = new Student05[size];
  }

  boolean isFull() {
    return top == size - 1;
  }

  boolean isEmpty() {
    return top == -1;
  }

  void push(Student05 std) {
    if (!isFull()) {
      top++;
      stack[top] = std;
    } else {
      System.out.println("Stack is already full!!");
    }
  }

  Student05 pop() {
    if (!isEmpty()) {
      Student05 std = stack[top];
      top--;
      return std;
    } else {
      System.out.println("There is no data in Stack!!");
      return null;
    }
  }

  Student05 peek() {
    if (!isEmpty()) {
      return stack[top];
    } else {
      System.out.println("There is no data in Stack!!");
      return null;
    }
  }

  Student05 peekBottom() {
    if (!isEmpty()) {
      return stack[0];
    } else {
      System.out.println("There is no data in Stack!!");
      return null;
    }
  }

  void print() {
    for (int i = top; i >= 0; i++) {
      System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].className);
    }
    System.out.println("");
  }

  String convertToBinary(int grade) {
    ConversionStack05 stack = new ConversionStack05();
    while (grade > 0) {
      int mod = grade % 2;
      stack.push(mod);
      grade = grade / 2;
    }
    String binary = "";
    while (!stack.isEmpty()) {
      binary += stack.pop();
    }
    return binary;
  }
}