package by.kadyko.lesson1;

import java.util.Scanner;

public class Sum5 {


    /*
    Даны 3 целых числа.
    Найти количество положительных и отрицательных чисел в исходном наборе..
    */
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in); // Объявляем Scanner

            int counterPositive = 0;
            int counterNegative = 0;

            int size = 3;

            int array[] = new int[size]; // Создаём массив int размером в size
            System.out.println("Insert array elements:");
            /*Пройдёмся по всему массиву, заполняя его*/
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            }

            for (int i = 0; i < size; i++) {
                if (array[i] > 0) {
                    counterPositive++;
                }else if (array[i] < 0) {
                    counterNegative++;
                }

            }

            System.out.println("There are " + counterPositive + " positive and " + counterNegative + " negative numbers in the original set");

        }
    }

