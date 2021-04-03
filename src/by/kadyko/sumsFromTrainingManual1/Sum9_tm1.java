package by.kadyko.sumsFromTrainingManual1;
//Изменить пример с суммой чисел таким образом
//чтобы рассчитывалась не сумма, а
//произведение, т.е. факториал числа
public class Sum9_tm1 {
    public static void main(String[] args) {

        long mpl = 1;
        int n = 0;
        int x = (int)(Math.random() * 20);

        if (x < 0) {
            x = x * (-1);
        }
        for (int i = 1; i <= x; i++) {
            mpl = mpl * i;
           }
        System.out.println(x + "! = " + mpl);
    }
}
