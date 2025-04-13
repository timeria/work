package org.example;


import java.time.LocalDate;

    public class Main {
        public static void main(String[] args) {
            StudentManager manager = new StudentManager();

            // Добавление студентов
            manager.addStudent(new Student("Елена", "A1", 1, new double[]{4.0, 3.5, 5.0}));
            manager.addStudent(new Student("Максим", "B2", 1, new double[]{2.0, 2.5, 3.0}));
            manager.addStudent(new Student("Денис", "C3", 2, new double[]{3.5, 4.0, 4.5}));

            // Удаление студентов с низким средним баллом
            manager.removeLowAchievingStudents();

            // Перевод студентов на следующий курс
            manager.promoteStudents();

            // Печать студентов на курсе 1
            manager.printStudents(1);

            // Печать студентов на курсе 2
            manager.printStudents(2);
        }
    }
