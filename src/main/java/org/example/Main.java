package org.example;


import java.time.LocalDate;

public class Main {

    //Проверка для товара
    /*public static void main(String[] args) {
        Good tovar = new Good("Пример товара", LocalDate.of(2023, 10, 1),
                "Производитель A", "Россия",
                "Россия", 100.0, false);
        tovar.displayInfo(); // Вывод информации о товаре
    }*/

    //создание массива из 5 товаров
    public static void main(String[] args) {
        // Создаем массив из 5 товаров
        Product[] products = new Product[5];

        // Заполняем массив товарами
        products[0] = new Product("Товар 1", 10);
        products[1] = new Product("Товар 2", 15);
        products[2] = new Product("Товар 3", 7);
        products[3] = new Product("Товар 4", 12.50);
        products[4] = new Product("Товар 5", 20);

    }

    //Проверка для аттракционов
    /*public static void main(String[] args) {
        Park amusementPark = new Park("Wonderland");
        amusementPark.addAttraction("Новый аттракцион", "10:00  - 22:00 ", 500);

        amusementPark.displayAttractions();
    }*/
}
