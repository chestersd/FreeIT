package by.kadyko.sumsFromTrainingManual1;
//Имеется целое число, определить является ли это число простым, т.е.
//делится без остатка только на 1 и себя.

public class Sum11_tm1 {
    public static void main(String[] args) {

        //int random = 22;
        int random = (int)(Math.random() * 1000);
        int counter = 0;

        for (int i = 2; i < random; i++) {
            if ((random % i) == 0)
                counter++;
        }
        if (counter == 0) {
            System.out.println(random + " - простое число");
        } else {
            System.out.println(random + " - не является простым числом");
        }
    }
}
