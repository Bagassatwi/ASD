package Jobsheet6;

public class SortingMain5 {
  public static void main(String[] args) {
    int c[] = { 67, 89, 12, 3, 4, 90 };
    Sorting5 sorting = new Sorting5(c);

    System.out.println("Original Array: ");
    sorting.print();
    sorting.bubbleSort();
    System.out.println("Sorted array (Bubble Sort)");
    sorting.print();

    System.out.println();
    System.out.println("Original Array: ");
    sorting.print();
    sorting.selectionSort();
    System.out.println("Sorted array (Selection Sort)");
    sorting.print();

    System.out.println();
    System.out.println("Original Array: ");
    sorting.print();
    sorting.insertionSort();
    System.out.println("Sorted array (Insertion Sort)");
    sorting.print();
  }
}
