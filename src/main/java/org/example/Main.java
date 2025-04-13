package org.example;


import java.time.LocalDate;

    public class Main {
        public static void main(String[] args) {
            String[][] array = {
                    {"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            };

            try {
                int sum = processArray(array);
                System.out.println("Сумма элементов массива: " + sum);
            } catch (MyArraySizeException e) {
                System.out.println("Ошибка размера массива: " + e.getMessage());
            } catch (MyArrayDataException e) {
                System.out.println("Ошибка данных массива: " + e.getMessage());
            }

            // Генерация ArrayIndexOutOfBoundsException
            try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]); // Попытка доступа к несуществующему элементу
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
            // Проверка размера массива
            if (array.length != 4 || array[0].length != 4) {
                throw new MyArraySizeException("Размер массива должен быть 4x4.");
            }

            int sum = 0;

            // Проход по элементам массива
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                    }
                }
            }

            return sum;
        }
    }




