package Jobsheet6;

import java.util.Scanner;

public class LecturerData5 {
    Lecturer5[] lecturerData = new Lecturer5[10];
    int idx = 0;

    void add(Lecturer5 dsn) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data is full!");
        }
    }

    void print() {
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
    }

    // Bubble Sort ASC (Youngest to Oldest)
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer5 temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort DSC (Oldest to Youngest)
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[maxIdx].age) {
                    maxIdx = j;
                }
            }
            Lecturer5 temp = lecturerData[maxIdx];
            lecturerData[maxIdx] = lecturerData[i];
            lecturerData[i] = temp;
        }
    }
}