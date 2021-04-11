package by.kadyko.strings;

import java.util.Scanner;

//Вырезать подстроку из строки начиная с первого вхождения символа(А) до
//последнего вхождения символа(B).
public class strings_sum1 {
    public static void main(String[] args) {

        String string = "Вырезать подстроку из строки начиная с первого вхождения символа(А) до последнего вхождения символа(B).";

        System.out.println("Введите символ А:(на русском языке!)");
        Scanner sc1 = new Scanner(System.in);
        String char1 = sc1.nextLine();

        System.out.println("Введите символ B:(на русском языке!)");
        Scanner sc2 = new Scanner(System.in);
        String char2 = sc2.nextLine();

        int index1 = string.indexOf(char1);
        int index2 = string.lastIndexOf(char2);

        String finalString = string.substring(index1,index2);
        System.out.println(finalString);




    }


}
