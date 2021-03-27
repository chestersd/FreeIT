package by.kadyko.lesson3;

import java.util.Scanner;

//Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
public class Sum4 {
    public static void main(String[] args) {

        int num = 0;
        System.out.println("Введите число a");
        Scanner a = new Scanner(System.in);
        int numA = a.nextInt();

        System.out.println("Введите число b");
        Scanner b = new Scanner(System.in);
        int numB = b.nextInt();

        for (int i = 1; i <= numB; i++){
          num = numA + num;
        }
        System.out.println("A*B = " + num);
    }
}
