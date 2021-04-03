package by.kadyko.lesson2;

import java.util.Scanner;

public class Sum3 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            num++;
        }else if (num < 0){
            num = num-2;
        }else if (num == 0){
            num = 10;
        }
        System.out.println("Итоговое число: " + num);
    }
}
