package by.kadyko.lesson3;

// Вычислить: 1+2+4+8+...+256

public class Sum3 {
    public static void main(String[] args) {

        int summ = 0;

        for (int i = 1; i <= 256; i = i * 2) {
           summ = summ + i;
        }
        System.out.println("Сумма чисел равняется " + summ);
    }
}
