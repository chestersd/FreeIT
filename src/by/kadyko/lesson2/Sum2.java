package by.kadyko.lesson2;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        boolean AB = false;
        boolean BC = false;
        boolean AC = false;

        System.out.println("Введите длину стороны a");
        Scanner a = new Scanner(System.in);
        int lenOfA = a.nextInt();

        System.out.println("Введите длину стороны b");
        Scanner b = new Scanner(System.in);
        int lenOfB = b.nextInt();

        System.out.println("Введите длину стороны c");
        Scanner c = new Scanner(System.in);
        int lenOfC = c.nextInt();



        if ((lenOfA + lenOfB) > lenOfC)
        {AB = true;}
        else if ((lenOfA + lenOfC) > lenOfB)
        {AC = true;}
        else if ((lenOfB + lenOfC) > lenOfA)
        {BC = true;}

        if (AB || AC || BC == true)
        {
            System.out.println("Такой треугольник существует");
        } else {
            System.out.println("Такой треугольник не существует");
        }

//        3em.out.println("BC " + BC);

    }
}
