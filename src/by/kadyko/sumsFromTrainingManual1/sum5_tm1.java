package by.kadyko.sumsFromTrainingManual1;
/*Дано любое натуральное 4-х значное число.
Верно ли, что все цифры числа
различны?*/
import java.util.Scanner;
public class sum5_tm1 {
    public static void main(String[] args) {
                int num1, num2,num3,num4;

                System.out.println("Введите 4-х значное натуральное число");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                    num1 = n / 1000;
                    num2 = (n - num1 * 1000) / 100;
                    num3 = (n - num1 * 1000 - num2 * 100) / 10;
                    num4 = n % 10;


                if (num1 != num2 && num2 != num3 && num3 != num4) {
                        System.out.println("Все цифры различны");

                } else {
                    System.out.println("Есть повторяющиеся цифры");
                }
            }
}
