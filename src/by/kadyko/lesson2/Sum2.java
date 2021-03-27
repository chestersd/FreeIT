package by.kadyko.lesson2;

import java.util.Scanner;

public class Sum2 {

    public static void main(String[] args) {

        boolean ab = false;

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
        {ab = true;}
//        else if ((lenOfA + lenOfC) > lenOfB)
//        {ac = true;}
//        else if ((lenOfB + lenOfC) > lenOfA)
//        {bc = true;}

        if (ab == true)
        {
            System.out.println("Такой треугольник существует");
        } else {
            System.out.println("Такой треугольник не существует");
        }



    }
}
