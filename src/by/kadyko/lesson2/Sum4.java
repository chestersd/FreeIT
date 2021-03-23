package by.kadyko.lesson1;

import java.util.Scanner;

/*
Даны 3 целых числа.
Найти количество положительных чисел в исходном наборе.
*/
public class Sum4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Объявляем Scanner

        int counter = 0;

        int size = 3;

        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }

        for (int i = 0; i < size; i++) {
            if (array[i] > 0) {
                counter++;
            }

        }

       System.out.println("There are " + counter + " positive numbers in the original set");

    }
}
