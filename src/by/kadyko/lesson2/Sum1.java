package by.kadyko.lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int number;
        String forLength;
        String[] txt = {"одно-", "двух-", "трех-", "четырех-"};
        while (!sc.hasNextDouble()) {
            System.out.println("Введите число:");
            sc.next();
        }
        number = (int) sc.nextDouble();
        forLength = String.valueOf(Math.abs(number));
        if (number >= 0) {
            System.out.println("Вы ввели " + txt[forLength.length() - 1] + "значное положительное число");
        } else {
            System.out.println("Вы ввели " + txt[forLength.length() - 1] + "значное отрицательное число");
        }
    }
}