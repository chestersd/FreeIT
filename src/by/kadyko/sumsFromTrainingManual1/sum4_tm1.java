package by.kadyko.sumsFromTrainingManual1;
//Определить число, полученное выписыванием в обратном порядке цифр
//любого 4-х значного натурального числа n

import java.util.Scanner;

public class sum4_tm1 {
    public static void main(String[] args) {

        int one;
        int two;
        int three;
        int four;

        System.out.println("Введите 4-х значное натуральное число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            n = n  * (-1);
        }

        four = n / 1000;
        three = (n % 1000) / 100;
        two = ((n % 1000) % 100) / 10;
        one = ((n % 1000) % 100) % 10;

        System.out.println("Обратное число " + one + two + three + four);

    }
}
