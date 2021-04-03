package by.kadyko.sumsFromTrainingManual1;
//Имеется целове число
//Это число – количесво денег в рублях. Вывести это число, добавив к
//нему слово «рублей» в правильном падеже

import java.util.Random;

public class Sum8_tm1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();
        int num = x % 10;
        if (num < 0) {
            num = num * (-1);
        }

        if (num == 1) {
            System.out.println(x + " рубль");
        } else if (num == 2 || num == 3 || num == 4) {
            System.out.println(x + " рубля");
        } else if (num == 5 || num == 6 || num == 7 || num == 8 || num == 9 || num == 0) {
            System.out.println(x + " рублей");
        }
    }
}
