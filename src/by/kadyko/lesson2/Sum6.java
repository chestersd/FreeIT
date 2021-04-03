package by.kadyko.lesson2;

// Даны 2 числа. Вывести большее из них

import java.util.Scanner;

public class Sum6 {
    public static void main(String[] args) {

        int size = 2;

        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/

        Scanner input = new Scanner(System.in); // Объявляем Scanner

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        if (array[0] > array[1]) {

            System.out.println(" Из двух введенных чисел бОльшим является " + array[0]);
        } else {
            System.out.println(" Из двух введенных чисел бОльшим является " + array[1]);
        }
    }
}