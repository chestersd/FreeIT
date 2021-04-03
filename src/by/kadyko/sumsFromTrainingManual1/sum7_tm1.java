package by.kadyko.sumsFromTrainingManual1;
//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//        полностью закрыть круглой картонкой радиусом r.

import java.util.Scanner;

public class sum7_tm1 {
    public static void main(String[] args) {

        System.out.println("Введите размер a");
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();

        System.out.println("Введите размер b");
        Scanner scb = new Scanner(System.in);
        int b = scb.nextInt();

        System.out.println("Введите радиус круга");
        Scanner scr = new Scanner(System.in);
        int r = scr.nextInt();

        int d = r * 2;

        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c = Math.sqrt(a2 + b2);

        if ((double)d >= c) {
            System.out.println("Отверстие закроется");
            } else {
            System.out.println("Отверстие не закроется");
        }

    }
}
