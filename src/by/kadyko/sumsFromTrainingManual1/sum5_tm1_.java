package by.kadyko.sumsFromTrainingManual1;
/*Дано любое натуральное 4-х значное число.
        Верно ли, что все цифры числа
различны?*/
import java.util.Scanner;
public class sum5_tm1_ {
    public static void main(String[] args) {
                int o;
                int t;
                int th;
                int f;

                System.out.println("Введите 4-х значное натуральное число");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                    f = n / 1000;
                    th = (n % 1000) / 100;
                    t = ((n % 1000) % 100) / 10;
                    o = ((n % 1000) % 100) % 10;


                if (o != f || o != t || o != th) {
                    if (t != th | th != f | t != f) {
                        System.out.println("ok");

                    }
                } else {
                    System.out.println("хуйня...");
                }
            }
}
