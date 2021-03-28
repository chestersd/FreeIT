package by.kadyko.lesson3;

/*
Одноклеточная амеба каждые 3 часа делится на 2 клетки.
 Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа
 */

public class Sum2 {
    public static void main(String[] args) {
        int numOfAmoeba = 1;

        for (int i = 3; i <= 24; i = i + 3) {

            numOfAmoeba = numOfAmoeba * 2;
            System.out.println("Через " + i + " ч. число амеб будет " + numOfAmoeba);

        }

    }

}
