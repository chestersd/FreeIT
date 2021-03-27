package by.kadyko.sumsFromTrainingManual1;
//Создайте число. Определите, является ли число трехзначным. Определите, является
//ли его последняя цифра семеркой. Определите, является ли число четным.

import java.util.Scanner;

public class sum6_tm1 {
    public static void main(String[] args) {

        String str;
        int lengthOfString;

        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        str = Integer.toString(n);
        lengthOfString = str.length();

        if (lengthOfString == 3) {
            System.out.println("Вы ввели 3-х значное число");
        } else {
            System.out.println("Введенное Вами число не является 3-х значным");
        }

        if ((n + 3) % 10 == 0) {

            System.out.println("последняя цифра семеркa");

        }
        if (n % 2 == 0) {
            System.out.println("Введенное Вами число четное");
        } else {
            System.out.println("Введенное Вами число нечетное");
        }
    }
}
