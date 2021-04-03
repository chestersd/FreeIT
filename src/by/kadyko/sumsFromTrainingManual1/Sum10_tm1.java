package by.kadyko.sumsFromTrainingManual1;
//Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
public class Sum10_tm1 {
    public static void main(String[] args) {
        long x = 1;
        for (int i = 10; i <= 15; i++) {
            x = x * i;
        }
        System.out.println(x);
    }
}
