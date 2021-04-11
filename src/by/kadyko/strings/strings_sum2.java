package by.kadyko.strings;
//Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в позиции 0
public class strings_sum2 {
    public static void main(String[] args) {

        String string = new String("happiness is not a destination. It is a method of life.");
        char c0 = string.charAt(0);
        char c3 = string.charAt(3);
        System.out.println(string.replace(c0, c3));
    }
}
