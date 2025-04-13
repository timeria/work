package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentManager {
    private Set<Student> students;

    public StudentManager() {
        this.students = new HashSet<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeLowAchievingStudents() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                iterator.remove();
            }
        }
    }

    public void promoteStudents() {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3.0) {
                student.promote();
            }
        }
    }

    public void printStudents(int course) {
        System.out.println("Students in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }
}
