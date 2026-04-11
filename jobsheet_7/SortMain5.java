package jobsheet_7.jobsheet_7;

public class SortMain5 {
  public static void main(String[] args) {
    int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
    MergeSort5 mSort = new MergeSort5();
    System.out.println("Sorting with merge sort");
    System.out.println("Initial Data");
    mSort.printArray(data);
    mSort.mergeSort(data);
    System.out.println("Sorted Data");
    mSort.printArray(data);
  }
}