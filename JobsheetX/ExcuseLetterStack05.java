public class ExcuseLetterStack05 {
  ExcuseLetter05[] stack;
  int top, size;

  ExcuseLetterStack05(int size) {
    this.size = size;
    top = -1;
    stack = new ExcuseLetter05[size];
  }

  boolean isFull() {
    return top == size - 1;
  }

  boolean isEmpty() {
    return top == -1;
  }

  void push(ExcuseLetter05 letter) {
    if (!isFull()) {
      top++;
      stack[top] = letter;
    } else {
      System.out.println("Stack is already full!!");
    }
  }

  ExcuseLetter05 peek() {
    if (!isEmpty()) {
      return stack[top];
    } else {
      System.out.println("There is no data in Stack!!");
      return null;
    }
  }

  ExcuseLetter05 pop() {
    if (!isEmpty()) {
      ExcuseLetter05 letter = stack[top];
      top--;
      return letter;
    }
    System.out.println("There is no data in Stack!!");
    return null;
  }
}
