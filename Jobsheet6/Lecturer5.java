package Jobsheet6;

public class Lecturer5 {
  String id;
  String name;
  boolean gender; // true for Male, false for Female
  int age;

  public Lecturer5(String id, String name, boolean gender, int age) {
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  void print() {
    String genderStr = gender ? "Male" : "Female";
    System.out.println("ID: " + id + " | Name: " + name + " | Gender: " + genderStr + " | Age: " + age);
  }
}
