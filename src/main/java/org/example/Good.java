package org.example;

import java.time.LocalDate;

public class Good {
    private String name;                // Название товара
    private LocalDate productionDate;   // Дата производства
    private String manufacturer;         // Производитель
    private String countryOfOrigin;      // Страна происхождения
    private String country;              // Страна
    private double price;                // Цена
    private boolean isReserved;          // Состояние бронирования покупателем

    // Конструктор класса
    public Good(String name, LocalDate productionDate, String manufacturer,
                 String countryOfOrigin, String country, double price,
                 boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.country = country;
        this.price = price;
        this.isReserved = isReserved;
    }

    // Метод для вывода информации об объекте
    public void displayInfo() {
        System.out.println("Название товара: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Страна: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Состояние бронирования: " + (isReserved ? "Забронирован" : "Не забронирован"));
    }

}

