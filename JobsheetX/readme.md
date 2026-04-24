# Jobsheet 10 - Stack

## 10.1 Experiment 1: Assignment Submission - Questions

### 1. Explain the role of the stack data structure in the student assignment management system. Why was a stack used instead of another data structure (e.g., queue or list)? 
The stack serves as a storage that follows the Last-In-First-Out (LIFO) principle
Stack is used because the requirement specifies that grading starts from the top of the pile.

### 2. What is the difference between the push() and pop() methods in a stack, and how are they used in this program? 
- push(): Adds a Student object to the top of the stack and increments the top index.
- pop(): Removes and returns the Student object from the top of the stack while decrementing the top index.

### 3. Why is it important to check the condition !isFull() before calling the push() method? What could go wrong if this check is removed? 
To prevent ArrayIndexOutOfBoundsException errors, if it were to be removed, the program could crash with an ArrayIndexOutOfBoundsException if the top is equals to size - 1.

### 4. How many student assignments can be stored in the current implementation of the stack? Provide the specific line of code or variable that determines this. 
The current implementation can store 5 assignments.
```java 
StudentAssignmentStack stack = new StudentAssignmentStack(5);.
```

### 5. Modify the existing stack implementation so that the system can also show the first student who submitted their assignment. Describe the changes you made. 
- StudentAssignmentStack: Create a peekBottom() method that returns stack[0] if !isEmpty().
- StudentDemo: Add a menu option "5. View First Submitter" and call stack.peekBottom().

### 6. Implement a method to count and return the number of assignments currently stored in the stack. Describe how your method works. 
```java
public int getCount() {
    return top + 1;
}
```
This works by taking the current top index and adding 1.

### 7. What did you learn from this experiment about stack-based systems? Reflect on a real-world application where this kind of system might be useful. 
Stacks are useful to manage data where the order of processing must be the reverse of the order of arrival. This system might be useful on Undo/Redo functionality in text editors, where the most recent action is the first one reverted.

---

## 10.2 Experiment 2: Convert Assignment Grade to Binary - Questions

### 1. Explain the workflow of the convertToBinary() method. 
1. An integer grade is received as a parameter.
2. A ConversionStack is instantiated.
3. A while loop calculates the remainder (grade % 2) and pushes it onto the stack, then updates the grade by dividing it by 2 until the grade is 0.
4. Elements are then popped from the stack and appended to a String.

### 2. In the convertToBinary() method, change the loop condition to while (grade != 0). What is the result? Explain the reason! 
The result remains the same because the program will terminate once grade reaches zero, but if the grade were negative, grade > 0 would skip the loop entirely, and enter an infinite loop.