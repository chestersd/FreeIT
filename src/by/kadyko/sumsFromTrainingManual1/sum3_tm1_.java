package by.kadyko.sumsFromTrainingManual1;
//Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
//        А) минут + секунд,
//        В) часов + минут + секунд,
//        С) дней + часов + минут + секунд,
//        D) недель + дней + часов + минут + секунд.

public class sum3_tm1_ {
    public static void main(String[] args) {

        int sec = 4500;
        int s = sec % 60;
        int m = (sec - s) / 60;
        int min = sec / 60;
        int hour = min / 60;

        System.out.println("A) "  + min + " минут " + s + " секунд");
        System.out.println("B) " + hour + " часов " + m + " минут " + sec + " секунд");
//        System.out.println("C) "  + min + " минут " + sec + " секунд");
//        System.out.println("D) "  + min + " минут " + sec + " секунд");
    }
}
