package Jobsheet6;

public class Student5 {
  String nim;
  String name;
  String studentClass;
  double gpa;

  public Student5() {
  }

  public Student5(String nim, String name, String studentClass, double gpa) {
    this.nim = nim;
    this.name = name;
    this.studentClass = studentClass;
    this.gpa = gpa;
  }

  public void print() {
    System.out.println("NIM: " + nim + ", Name: " + name + ", Class: " + studentClass + ", GPA: " + gpa);
  }

}