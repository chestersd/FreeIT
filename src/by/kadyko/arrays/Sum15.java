package by.kadyko.arrays;
//    Создать массив, заполнить его случайными элементами, распечатать,
//    перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//    еще один массив).

public class Sum15 {
    public static void main(String[] args) {

        int array[] = new int[6];
        System.out.print("  Прямой вывод: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int length = array.length;
        int tempValue;

        for (int i = 0; i < length / 2; i++) {

            tempValue = array[length - i - 1];
            array[array.length - 1 - i] = array[i];
            //System.out.println("Обратный вывод: " + array[i]);
            array[i] = tempValue;
        }
        System.out.print("Обратный вывод: ");

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");

        }

    }

}





