package by.kadyko.lesson3;
//Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
public class Sum7 {
    public static void main(String[] args) {
        int summ = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                summ = summ + i;
            }
        }
            System.out.println("Сумма равна " + summ);

    }
}