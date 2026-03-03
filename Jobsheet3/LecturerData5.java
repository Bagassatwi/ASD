package Jobsheet3;

public class LecturerData5 {

    public void allLecturerData(Lecturer5[] arrayOfLecturer) {
        System.out.println("\n=== All Lecturers Data ===");
        for (Lecturer5 lec : arrayOfLecturer) {
            System.out.println("Code    : " + lec.code);
            System.out.println("Name    : " + lec.name);
            System.out.println("Gender  : " + (lec.gender ? "Male" : "Female"));
            System.out.println("Age     : " + lec.age);
            System.out.println("------------------------------------");
        }
    }

    public void numberOfLecturersPerGender(Lecturer5[] arrayOfLecturer) {
        int maleCount = 0;
        int femaleCount = 0;
        for (Lecturer5 lec : arrayOfLecturer) {
            if (lec.gender)
                maleCount++;
            else
                femaleCount++;
        }
        System.out.println("\n=== Total Lecturers Per Gender ===");
        System.out.println("Male    : " + maleCount);
        System.out.println("Female  : " + femaleCount);
    }

    public void averageAgeOfLecturersPerGender(Lecturer5[] arrayOfLecturer) {
        int maleSum = 0, maleCount = 0;
        int femaleSum = 0, femaleCount = 0;

        for (Lecturer5 lec : arrayOfLecturer) {
            if (lec.gender) {
                maleSum += lec.age;
                maleCount++;
            } else {
                femaleSum += lec.age;
                femaleCount++;
            }
        }

        System.out.println("\n=== Average Age Per Gender ===");
        System.out.println("Male    : " + (maleCount > 0 ? (double) maleSum / maleCount : 0));
        System.out.println("Female  : " + (femaleCount > 0 ? (double) femaleSum / femaleCount : 0));
    }

    public void oldestLecturerInfo(Lecturer5[] arrayOfLecturer) {
        if (arrayOfLecturer.length == 0)
            return;
        Lecturer5 oldest = arrayOfLecturer[0];
        for (Lecturer5 lec : arrayOfLecturer) {
            if (lec.age > oldest.age) {
                oldest = lec;
            }
        }
        System.out.println("\n=== Oldest Lecturer5 Info ===");
        displaySingleLecturer(oldest);
    }

    public void youngestLecturerInfo(Lecturer5[] arrayOfLecturer) {
        if (arrayOfLecturer.length == 0)
            return;
        Lecturer5 youngest = arrayOfLecturer[0];
        for (Lecturer5 lec : arrayOfLecturer) {
            if (lec.age < youngest.age) {
                youngest = lec;
            }
        }
        System.out.println("\n=== Youngest Lecturer5 Info ===");
        displaySingleLecturer(youngest);
    }

    private void displaySingleLecturer(Lecturer5 lec) {
        System.out.println("Code    : " + lec.code);
        System.out.println("Name    : " + lec.name);
        System.out.println("Gender  : " + (lec.gender ? "Male" : "Female"));
        System.out.println("Age     : " + lec.age);
        System.out.println("------------------------------------");
    }
}