package by.kadyko.lesson2;

//В переменную записываете количество программистов.
//В зависимости от количества программистов необходимо
//        вывести правильно окончание.
//        Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.

import java.util.Scanner;
 /*
 В переменную записываете количество программистов.
 В зависимости от количества программистов необходимо
 вывести правильно окончание. Например: • 2 программиста •
 1 программиста • 10 программистов • и т.д.
  */
public class Sum7 {

    public static void main(String[] args) {

        System.out.println("Введите количество программистов:");

        Scanner input = new Scanner(System.in);
        int numOfProgrammers = input.nextInt();

        String text = "программист 1000";
        int numOf100Programmers;

        if (numOfProgrammers < 10) {
            if (numOfProgrammers == 1) {
                text = " программист";
            } else if (numOfProgrammers == 2) {
                text = " программиста";
            } else if (numOfProgrammers == 3) {
                text = " программиста";
            } else if (numOfProgrammers == 4) {
                text = " программиста";
            } else if (numOfProgrammers == 5) {
                text = " программистов";
            } else if (numOfProgrammers == 6) {
                text = " программистов";
            } else if (numOfProgrammers == 7) {
                text = " программистов";
            } else if (numOfProgrammers == 8) {
                text = " программистов";
            } else if (numOfProgrammers == 9) {
                text = " программистов";
            }

        } else if (numOfProgrammers > 100) {
            System.out.println("Слишком много программистов");
        } else if (numOfProgrammers < 100) {
            numOf100Programmers = numOfProgrammers % 10;

            if (numOf100Programmers == 1) {
                text = " программист";
            } else if (numOf100Programmers == 2) {
                text = " программиста";
            } else if (numOf100Programmers == 3) {
                text = " программиста";
            } else if (numOf100Programmers == 4) {
                text = " программиста";
            } else if (numOf100Programmers == 5) {
                text = " программистов";
            } else if (numOf100Programmers == 6) {
                text = " программистов";
            } else if (numOf100Programmers == 7) {
                text = " программистов";
            } else if (numOf100Programmers == 8) {
                text = " программистов";
            } else if (numOf100Programmers == 9) {
                text = " программистов";
            } else if (numOf100Programmers == 0) {
                text = " программистов";
            }

        }

        System.out.println("В офисе " + numOfProgrammers + text);
    }

}



