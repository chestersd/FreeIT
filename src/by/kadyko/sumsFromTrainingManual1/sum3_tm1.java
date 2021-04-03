package by.kadyko.sumsFromTrainingManual1;
//Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
//        А) минут + секунд,
//        В) часов + минут + секунд,
//        С) дней + часов + минут + секунд,
//        D) недель + дней + часов + минут + секунд.
public class sum3_tm1 {
    public static void main(String[] args) {
        //Block A ok
        int sec = 4500;
        int s = sec % 60;
        int min = sec / 60;
        System.out.println("A) " + min + " минут " + s + " секунд");
        //Block B ok
        int hour = sec / 3600;
        min = (sec % 3600) / 60;
        System.out.println("B) " + hour + " часов " + min + " минут " + s + " секунд");
        //Block C ok
        int day = sec / 86400;
        hour = sec % 86400 / 3600;
        System.out.println("C) " + day + " дней "+ hour + " часов " + min + " минут " + s + " секунд");
        //Block D ok
        int week = sec / 604800;
        int d = (sec - week * 604800)/86400;
        System.out.println("D) " + week + " недель " + d + " дней "+ hour + " часов " + min + " минут " + s + " секунд");
        //int m = (sec - s) / 60;
    }
}
