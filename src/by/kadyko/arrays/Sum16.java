package by.kadyko.arrays;
//Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями.




public class Sum16 {
    public static void main(String[] args) {

        int iMax = -1;
        int iMin = -1;
        int maxValue = -1;
        int minValue = 11;
        int summ = 0;


        int array[] = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
            if (maxValue <= array[i]) {
                maxValue = array[i];
                iMax = i;
            }
            if (minValue >= array[i]) {
                minValue = array[i];
                iMin = i;
            }
        }
        if (iMax > iMin) {
            for (int i = iMin + 1; i < iMax; i++)
                summ = summ + array[i];
        } else if (iMin > iMax) {
            for (int i = iMax + 1; i < iMin; i++)
                summ = summ + array[i];
        }
        System.out.println("Сумма значений элеметов массива равна: " + summ);
    }
}


