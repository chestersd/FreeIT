package by.kadyko.lesson3;
/*
Напишите программу печати
таблицы перевода расстояний из дюймов
в сантиметры для значений длин от 1 до 20 дюймов.
1 дюйм = 2,54 см
 */
public class Sum5 {
    public static void main(String[] args) {

            for (int i = 1; i <= 20; i++){
               double cm = i * 2.54;
                System.out.println(i + " дюймов = " + cm + " сантиметров");
        }
    }
}
