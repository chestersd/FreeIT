package by.kadyko.sumsFromTrainingManual1;
import java.util.Scanner;
//Найдите сумму первых n целых чисел, которые делятся на 3.
public class Sum12_tm1 {
    public static void main(String[] args) {

        int counter = 0;
        int input;
        int summ = 0;

        System.out.println("Введите количество чисел:");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();


        for (int i = 3; i <= 1000; i++) {

            if (counter < input && i % 3 == 0) {
                    summ = summ + i;
                    counter++;
            }
        }
        System.out.println("Сумма первых " + input + " целых чисел, которые делятся на 3, раняется " + summ);
    }
}


