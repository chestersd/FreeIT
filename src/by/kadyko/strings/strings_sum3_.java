package by.kadyko.strings;

import java.lang.reflect.Array;

//В исходном файле находятся слова, каждое слово на новой стороке. После
//запуска программы должен создать файл, который будет содержать в себе
//только полиндромы
public class strings_sum3_ {
    public static void main(String[] args) {
//        String str0 = new String("город");
//        String str1 = new String("дорог");
//        String str2 = new String("лазер");
//        String str3 = new String("резал");
//        String str4 = new String("ненец");
//        String str5 = new String("ценен");
//        String str6 = new String("доска");
//        String str7 = new String("енот");
//        String str8 = new String("пианино");
//        String str9 = new String("дирижабль");

        String array [] = new String[]{"резал", "город", "ценен", "дорог", "ненец", "доска", "енот", "дирижабль", "пианино", "лазер"};

//        for (int i = 0; i < array.length; i++){

            StringBuilder strBuilder = new StringBuilder(array[1]);
            strBuilder.reverse();
//            if(array[i] == )


        System.out.print(array[3].toString() == strBuilder.toString());
    }
}
