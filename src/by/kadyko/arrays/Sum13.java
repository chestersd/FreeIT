package by.kadyko.arrays;
//Создать последовательность случайных чисел, найти и вывести наибольшее
//из них.
import java.util.Random;
public class Sum13 {
    public static void main(String[] args) {

        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("max " + max);
        System.out.println("min " + min);

        }
    }
