package org.example;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик");
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Василиса");

        dog1.run(400);
        dog1.swim(5);

        cat1.run(150);
        cat1.swim(1); // Кот не умеет плавать

        FoodBowl bowl = new FoodBowl(2); // Изначально 2 порции еды

        Cat[] cats = {cat1, cat2};

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        for (Cat cat : cats) {
            System.out.println(cat.name + " сытость: " + cat.isFull());
        }

        System.out.println("Общее количество животных: " + Animal.getAnimalCount());
    }


    //Класс для тестирования фигур
    /*public class Main {
        public static void main(String[] args) {
            Shape circle = new Circle(5, "Red", "Black");
            Shape rectangle = new Rectangle(4, 6, "Green", "Blue");
            Shape triangle = new Triangle(3, 4, 5, "Yellow", "Purple");

            printShapeDetails(circle);
            printShapeDetails(rectangle);
            printShapeDetails(triangle);
        }

        private static void printShapeDetails(Shape shape) {
            System.out.println("Фигура: " + shape.getClass().getSimpleName());
            System.out.println("Периметр: " + shape.calculatePerimeter());
            System.out.println("Площадь: " + shape.calculateArea());
            System.out.println("Цвет заливки: " + shape.getFillColor());
            System.out.println("Цвет границы: " + shape.getBorderColor());
            System.out.println();
        }
    }*/
}



